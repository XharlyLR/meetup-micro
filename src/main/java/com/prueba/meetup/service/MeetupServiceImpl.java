package com.prueba.meetup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.meetup.domains.entity.Location;
import com.prueba.meetup.domains.entity.MeetUps;
import com.prueba.meetup.domains.entity.dto.MeetUpOutputDto;
import com.prueba.meetup.repository.MeetupRepository;

@Service
public class MeetupServiceImpl implements MeetupService {

	@Autowired
	private MeetupRepository meetupRepository;
	
	@Override
	public MeetUpOutputDto getMeetUps() {
		MeetUpOutputDto meetUpOutputDto = new MeetUpOutputDto();
		
		List<MeetUps> meetUpsList = meetupRepository.findAll();
		
		List<String> meetUpsStrings = new ArrayList<>();
		
		for (MeetUps meetUps : meetUpsList) {
			String meetUpString = "";

			boolean alreadyCity = false;
			String prevCountry = null;
			String state = null;
			
			if (meetUps.getEdition() != null) {
				meetUpString = meetUpString.concat(meetUps.getEdition() + " ");
			}
				
			meetUpString = meetUpString.concat(meetUps.getName() + " · " + meetUps.getStartDate());
			
			if(meetUps.getEndDate() != null) {
				meetUpString = meetUpString.concat(" / " + meetUps.getEndDate());
			}
			
			meetUpString = meetUpString.concat(" · ");
			
			for (Location location : meetUps.getLocation()) {
				
				if (prevCountry != null) {
					if(location.getCountry().equalsIgnoreCase(prevCountry)) {
						meetUpString = meetUpString.concat(" | ");
					}
					else {
						meetUpString = meetUpString.concat(", " + prevCountry + " | ");
					}
				}
				
				if (location.getCity() != null) {
					meetUpString = meetUpString.concat(location.getCity());
					alreadyCity = true;
				}
				
				if (location.getState() != null) {
					if (alreadyCity) {
						state = location.getState();
					}
					else {
						meetUpString = meetUpString.concat(location.getState() + ", ");
					}
				}
				
				prevCountry = location.getCountry();
			}
			
			if (alreadyCity) {
				meetUpString = meetUpString.concat(", ");
			}
			
			if (state != null) {
				meetUpString = meetUpString.concat(state + ". ");
			}
			
			meetUpString = meetUpString.concat(prevCountry);
			
			meetUpsStrings.add(meetUpString);
		}
		
		meetUpOutputDto.setMeetUps(meetUpsStrings);
		
		return meetUpOutputDto;
	}

	@Override
	public List<MeetUps> createMeetUps(List<MeetUps> meetUpsList) {
		return meetupRepository.saveAll(meetUpsList);
	}

}
