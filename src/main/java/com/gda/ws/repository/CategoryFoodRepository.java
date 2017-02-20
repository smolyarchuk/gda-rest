package com.gda.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gda.ws.entity.CategoryFood;

@Repository
public interface CategoryFoodRepository extends JpaRepository<CategoryFood, Long> {

}
