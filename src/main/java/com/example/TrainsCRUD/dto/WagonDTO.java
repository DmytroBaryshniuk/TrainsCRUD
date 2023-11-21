package com.example.TrainsCRUD.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class WagonDTO {


    private int id;
    public char type;
    public int seatsAmount;

    public WagonDTO(int id, char type, int seatsAmount) {
        this.id = id;
        this.type = type;
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
