package com.findajob.backend.converters;

import com.findajob.backend.data.CategoriesData;
import com.findajob.backend.entities.Categories;

public class CategoryConverter extends Converter <Categories, CategoriesData>{

    @Override
    public Categories toEntity(CategoriesData object) {
        return Categories.builder()
            .id(object.getId())
            .name(object.getName())
            .descripcion(object.getDescripcion())
            .build();
    }

    @Override
    public CategoriesData toData(Categories object) {

        return CategoriesData.builder()
        .id(object.getId())
        .name(object.getName())
        .descripcion(object.getDescripcion())
        .build();
    }
    
}
