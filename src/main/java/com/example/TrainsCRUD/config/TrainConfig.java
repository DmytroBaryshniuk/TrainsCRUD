package com.example.TrainsCRUD.config;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.repository.TrainRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TrainConfig {

    @Bean
    CommandLineRunner commandLineRunner(TrainRepository trainRepository){
        return args -> {
            Train intercity = new Train(
                    199L,
                    "Intercity",
                    null,
                    null
            );
            Train polregio = new Train(
                    200L,
                    "Polregio",
                    null,
                    null
            );
            trainRepository.saveAll(List.of(intercity, polregio));
        };
    }
}