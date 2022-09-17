package com.findajob.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //Reconoce como tabla en la base de datos
@Getter //Genera internamente todos los getter
@Setter 
@NoArgsConstructor //Crea el constructor por defecto
@AllArgsConstructor //Crea el constructor con todos los parámetros
@Builder //Compilación de la clase 
public class Role {

    @Id //Define la llave primaria
    @Column (nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Campo autoincrementable
    private int id;
    
    @Column(nullable = false, unique = true)
    private String name;
}
