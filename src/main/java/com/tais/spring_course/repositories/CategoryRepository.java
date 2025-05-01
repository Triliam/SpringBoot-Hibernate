package com.tais.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tais.spring_course.entities.Category;
import com.tais.spring_course.entities.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
