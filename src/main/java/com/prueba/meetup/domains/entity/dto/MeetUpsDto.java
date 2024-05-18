package com.prueba.meetup.domains.entity.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Valid
public class MeetUpsDto {

	@JsonProperty("edition")
	private String edition;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("startDate")
	private String startDate;
	
	@JsonProperty("endDate")
	private String endDate;
	
	@JsonProperty("location")
	@Valid
	private List<LocationDto> location;

}
