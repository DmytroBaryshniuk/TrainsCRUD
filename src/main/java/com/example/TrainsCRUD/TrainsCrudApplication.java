package com.example.TrainsCRUD;

import com.example.TrainsCRUD.repository.TrainRepository;
import com.example.TrainsCRUD.repository.WagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainsCrudApplication {

	@Autowired
	private TrainRepository trainRepository;

	@Autowired
	private WagonRepository wagonRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrainsCrudApplication.class, args);
	}

	public void run(String... args){

	}

}
