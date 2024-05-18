package com.prueba.meetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.meetup.domains.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
