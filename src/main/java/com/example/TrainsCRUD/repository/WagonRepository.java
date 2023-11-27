package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WagonRepository extends JpaRepository<Wagon, Integer> {

    Wagon findById(Long id);

    List<Wagon> findByType(char type);
    List<Wagon> findBySeatsAmount(int seatsAmount);
    List<Wagon> getWagonsForTrainById(Integer trainId);

}
