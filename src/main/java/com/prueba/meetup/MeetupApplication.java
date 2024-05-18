package com.prueba.meetup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class MeetupApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MeetupApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("------------------> Aplicacion iniciada");
	}
}
