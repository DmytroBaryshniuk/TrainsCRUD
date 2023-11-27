package com.example.TrainsCRUD.service;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.entity.Wagon;
import com.example.TrainsCRUD.repository.TrainRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;


@Service
public class TrainService {

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
    public void createNewTrain(Train train) {
        if (trainRepository.findByTrainId(train.getTrainId()) != null){
            throw new EntityExistsException("This train already exist!");
        }
        trainRepository.save(new Train(train.getTrainId(), train.getTrainOperator(), train.wagons));
//        System.out.println("New train saved to the DB!");
    }

    public Train findByTrainId(Integer id) {
        return trainRepository.findByTrainId(id);
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public List<Train> findByOperator(String trainOperator){
        return trainRepository.findByTrainOperator(trainOperator);
    }

    public void deleteTrain(Integer id){
        trainRepository.delete(trainRepository.findByTrainId(id));
    }
    public List<Wagon> getAllWagonsByTrainId(Integer id){
        return trainRepository.getAllWagonsByTrainId(id);
    }
}
