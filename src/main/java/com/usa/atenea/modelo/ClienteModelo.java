package com.usa.atenea.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClienteModelo {
    @Id
    private int id;
    private String name;
    private String email;
    private int edad;
}