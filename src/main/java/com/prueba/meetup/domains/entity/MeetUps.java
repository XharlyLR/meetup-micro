package com.prueba.meetup.domains.entity;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Validated
@Entity
@Table(name = "MEET_UP")
public class MeetUps {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEETUP_ID")
    private Long meetUpID;
	
	@Column(name = "EDITION")
	private String edition;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private String endDate;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "LOCATION")
	private List<Location> location;
	
}
