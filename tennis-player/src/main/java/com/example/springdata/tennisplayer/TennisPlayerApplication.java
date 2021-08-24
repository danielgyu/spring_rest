package com.example.springdata.tennisplayer;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    /*
		logger.info("All Players Data: {}", 
			dao.getAllPlayers());
		logger.info("Player with id 3 is : {}",
			dao.getPlayerById(3));
		logger.info("Inserting Plyaer 4: {}",
			dao.insertPlayer(new Player (
				4,
				"Thiem",
				"Austria",
				new Date(System.currentTimeMillis()),
				17
				)));
		logger.info("All Players Data: {}", 
			dao.getAllPlayers());
	    */
	    logger.info("Query by nationality: {}",
		    dao.getPlayersByNationality("France"));
	}
}
