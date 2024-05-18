package com.prueba.meetup.service;

import java.util.List;

import com.prueba.meetup.domains.entity.MeetUps;
import com.prueba.meetup.domains.entity.dto.MeetUpOutputDto;

public interface MeetupService {

	MeetUpOutputDto getMeetUps();
	
	List<MeetUps> createMeetUps(List<MeetUps> meetUpsList);
	
}
