package com.example.TrainsCRUD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Data
@Table(name = "Trains")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer trainId;
    private String trainOperator;
    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    public List<Wagon> wagons = new ArrayList<Wagon>();

}
