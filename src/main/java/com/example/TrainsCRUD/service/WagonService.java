package com.example.TrainsCRUD.service;

import com.example.TrainsCRUD.entity.Wagon;
import com.example.TrainsCRUD.repository.WagonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WagonService {
    private final WagonRepository wagonRepository;

    public WagonService(WagonRepository wagonRepository) {
        this.wagonRepository = wagonRepository;
    }

    public List<Wagon> getWagonsForTrainById(Integer id) {
        return wagonRepository.getWagonsForTrainById(id);
    }

    public List<Wagon> findByType(char type){
        return wagonRepository.findByType(type);
    }

    public List<Wagon> findBySeatsAmount(int amount){
        return wagonRepository.findBySeatsAmount(amount);
    }
    public Wagon findByWagonId(Long id){
        if (wagonRepository.findById(id) == null){
            throw new EntityNotFoundException(String.format("Wagon with id %d not found", id));
        }
        return wagonRepository.findById(id);
    }
}
