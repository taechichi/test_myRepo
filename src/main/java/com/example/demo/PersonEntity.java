package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="person")
public class PersonEntity {
    @Id
    @Column(name = "id", nullable = false, length = 30)
    private String id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "age")
    int age;
}


