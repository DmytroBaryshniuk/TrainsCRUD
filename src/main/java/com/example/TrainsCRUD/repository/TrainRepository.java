package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {


    Optional<Train> findByTrainId(Long id);
//    Optional<Train> findByOperator(String trainOperator);

    @Override
    List<Train> findAll();
}
