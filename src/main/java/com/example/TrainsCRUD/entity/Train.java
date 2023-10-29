package com.example.TrainsCRUD.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Train {

    public int id;
    private String trainOperator;
    public List<Wagon> wagons;
    public Map<String, String> route;
}
