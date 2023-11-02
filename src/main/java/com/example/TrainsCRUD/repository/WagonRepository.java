package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Wagon;

import java.util.Optional;

public interface WagonRepository {
    Optional<Wagon> findByWagonId(Long id);
    Optional<Wagon> findByType(char type);
    Optional<Wagon> findBySeatsAmount(int seatsAmount);
}
