package com.prueba.meetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.meetup.domains.entity.dto.MeetUpInputDto;
import com.prueba.meetup.domains.entity.dto.MeetUpOutputDto;
import com.prueba.meetup.domains.entity.dto.MeetUpsDto;
import com.prueba.meetup.mapper.MeetUpsMapper;
import com.prueba.meetup.service.MeetupService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(path = { "/api/meetups" })
public class MeetupController {

	@Autowired
	private MeetupService meetupService;
	
	private final MeetUpsMapper meetUpsmapper;
	
	@GetMapping
	public MeetUpOutputDto getAll() {
		return meetupService.getMeetUps();
	}
	
	@PostMapping
	public ResponseEntity<List<MeetUpsDto>> postAll(@Valid @RequestBody MeetUpInputDto meetUpsInput) {
		return ResponseEntity.ok(meetUpsmapper.toApiDomain(meetupService.createMeetUps(meetUpsmapper.fromApiDomain(meetUpsInput.getInput()))));
	}
	
}
