package com.prueba.meetup.domains.entity;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Validated
@Entity
@Table(name = "LOCATION")
public class Location {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOCATION_ID")
    private Long locationID;
	
	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;
	
}
