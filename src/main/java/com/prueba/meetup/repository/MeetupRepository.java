package com.prueba.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.meetup.domains.entity.MeetUps;

public interface MeetupRepository extends JpaRepository<MeetUps, Long> {

}
