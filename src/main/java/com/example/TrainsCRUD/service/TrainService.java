package com.example.TrainsCRUD.service;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.repository.TrainRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;


@Service
public class TrainService implements TrainRepository{

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> getTrains(){
        return trainRepository.findAll();
    }

    public void createNewTrain(Train train) {
        Optional<Train> trainById = trainRepository
                .findByTrainId(train.getTrainId());
        if (trainById.isPresent()){
            throw new EntityExistsException("This train already exist!");
        }
        trainRepository.save(train);
        System.out.println("New train saved to the DB!");
    }

    @Override
    public Optional<Train> findByTrainId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Train> findAll() {
        return null;
    }
}
