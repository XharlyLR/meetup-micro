package com.prueba.meetup.domains.entity.dto;

import java.util.List;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Valid
public class MeetUpInputDto {
	
	private List<MeetUpsDto> input;

}
