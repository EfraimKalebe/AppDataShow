package com.example.dataschedule.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
