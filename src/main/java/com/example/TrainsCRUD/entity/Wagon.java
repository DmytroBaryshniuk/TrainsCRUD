package com.example.TrainsCRUD.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    public char type;
    public int seatsAmount;
    @ManyToOne
    @JoinColumn(name = "trainId")
    private Train train;
}
