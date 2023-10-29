package com.example.TrainsCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Wagon {
    @Getter
    @Id
    private int id;
    public char type;
    public int seatsAmount;
    private Train train;


//    public Wagon(int id, char type, int seatsAmount, Train train){
//        this.id = id;
//        this.type = type;
//        this.seatsAmount = seatsAmount;
//        this.train = train;
//    }

    public Wagon() {

    }

    public void setId(int id) {
        this.id = id;
    }

}
