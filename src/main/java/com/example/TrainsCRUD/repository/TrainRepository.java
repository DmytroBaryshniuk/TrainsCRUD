package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

//    @Query("SELECT t FROM Train t WHERE t.id = ?1")
    Optional<Train> findByTrainId(Long id);
    Optional<Train> findByTrainRoute(Map<String, String> route);
    Optional<Train> findByOperator(String trainOperator);
}
