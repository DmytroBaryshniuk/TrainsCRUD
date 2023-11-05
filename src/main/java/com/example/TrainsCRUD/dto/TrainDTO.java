package com.example.TrainsCRUD.dto;

import com.example.TrainsCRUD.entity.Wagon;
import jakarta.persistence.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TrainDTO {

    private Long trainId;
    private String trainOperator;

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getTrainOperator() {
        return trainOperator;
    }

    public void setTrainOperator(String trainOperator) {
        this.trainOperator = trainOperator;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    private List<Wagon> wagons;

    public TrainDTO(){
    }

    public TrainDTO(Long trainId, String trainOperator, List<Wagon> wagons){
        this.trainId = trainId;
        this.trainOperator = trainOperator;
        this.wagons = wagons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainDTO trainDTO = (TrainDTO) o;
        return Objects.equals(trainId, trainDTO.trainId) && Objects.equals(trainOperator, trainDTO.trainOperator) && Objects.equals(wagons, trainDTO.wagons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, trainOperator, wagons);
    }

    @Override
    public String toString() {
        return "TrainDTO{" +
                "trainId=" + trainId +
                ", trainOperator='" + trainOperator + '\'' +
                ", wagons=" + wagons +
                '}';
    }
}
