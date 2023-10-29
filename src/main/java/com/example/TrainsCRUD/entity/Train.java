package com.example.TrainsCRUD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Entity
@Data
@Table
@Builder
@AllArgsConstructor
public class Train {

    @Id
    public Long id;
    private String trainOperator;
    @OneToMany
    public List<Wagon> wagons;
    @ElementCollection
    public Map<String, String> route;

    public Train() {

    }
}
