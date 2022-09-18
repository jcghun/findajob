package com.findajob.backend.data;

import java.util.Date;

import com.findajob.backend.entities.Categories;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacantData {

    private int id;

    private String name;

    private Date date;

    private String descripcion;

    private Categories category;

    private String image;

    private double salary;

    private boolean enable;

}
