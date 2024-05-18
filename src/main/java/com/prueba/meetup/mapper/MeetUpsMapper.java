package com.prueba.meetup.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.prueba.meetup.domains.entity.MeetUps;
import com.prueba.meetup.domains.entity.dto.MeetUpsDto;

@Mapper(componentModel = "spring", uses = LocationMapper.class)
public interface MeetUpsMapper {

	List<MeetUpsDto> toApiDomain(final List<MeetUps> source);
	
	List<MeetUps> fromApiDomain(final List<MeetUpsDto> source);
	
	MeetUpsDto toDto(MeetUps meetUps);

    MeetUps fromDto(MeetUpsDto meetUpsDto);
	
}
