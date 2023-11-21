package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WagonRepository extends JpaRepository<Wagon, Long> {
    Optional<Wagon> findByWagonId(Long id);
    Optional<Wagon> findByType(char type);
    Optional<Wagon> findBySeatsAmount(int seatsAmount);
}
