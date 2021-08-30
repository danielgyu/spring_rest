package com.example.springdata.tennisplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisPlayerApplication {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
	    SpringApplication.run(TennisPlayerApplication.class, args);
    }

    public void run(String... args) throws Exception {
	logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
			new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
	logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
			new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
    }
	
}
