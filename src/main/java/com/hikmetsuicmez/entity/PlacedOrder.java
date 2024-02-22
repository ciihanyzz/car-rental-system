package com.hikmetsuicmez.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "place_order")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlacedOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long carId;
    private String brand;
    private String model;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
