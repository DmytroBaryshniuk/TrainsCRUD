package com.example.TrainsCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wagon {

    @Id
    private int id;
    public char type;
    public int seatsAmount;
    @OneToOne
    private Train train;


}
