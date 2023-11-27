package com.example.TrainsCRUD.repository;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.entity.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

    Train findByTrainId(@Param("trainId") Integer id);

    List<Train> findByTrainOperator(@Param("trainOperator") String trainOperator);

    @Override
    List<Train> findAll();

    @Override
    Train save(Train train);


    List<Wagon> getAllWagonsByTrainId(@Param("trainId") Integer Id);
}
