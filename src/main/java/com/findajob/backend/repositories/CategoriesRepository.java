package com.findajob.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.findajob.backend.entities.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository <Categories, Integer>{
    
}
