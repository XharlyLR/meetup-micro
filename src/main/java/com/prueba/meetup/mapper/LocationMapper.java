package com.prueba.meetup.mapper;

import org.mapstruct.Mapper;

import com.prueba.meetup.domains.entity.Location;
import com.prueba.meetup.domains.entity.dto.LocationDto;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	LocationDto toApiDomain(final Location source);
	
	Location fromApiDomain(final LocationDto source);
	
}
