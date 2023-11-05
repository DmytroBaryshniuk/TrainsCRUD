package com.example.TrainsCRUD.dto;

import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.entity.Wagon;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

public class WagonDTO {


    private int id;
    public char type;
    public int seatsAmount;

    public WagonDTO(int id, char type, int seatsAmount) {
        this.id = id;
        this.type = type;
        this.seatsAmount = seatsAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WagonDTO wagonDTO = (WagonDTO) o;
        return id == wagonDTO.id && type == wagonDTO.type && seatsAmount == wagonDTO.seatsAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, seatsAmount);
    }

    @Override
    public String toString() {
        return "WagonDTO{" +
                "id=" + id +
                ", type=" + type +
                ", seatsAmount=" + seatsAmount +
                '}';
    }
}
