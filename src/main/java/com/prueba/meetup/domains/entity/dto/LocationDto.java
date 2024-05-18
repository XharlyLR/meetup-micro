package com.prueba.meetup.domains.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Valid
public class LocationDto {

	@JsonProperty("city")
	private String city;
	
	@JsonProperty("state")
	private String state;
	
	@JsonProperty("country")
	private String country;
	
}
