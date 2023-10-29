package com.example.TrainsCRUD.service;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class TrainService {

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }


    @GetMapping
    public List<Train> getTrains(){
        return trainRepository.findAll();
    }
}
