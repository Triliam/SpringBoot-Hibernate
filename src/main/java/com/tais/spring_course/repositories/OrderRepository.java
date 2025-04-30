package com.tais.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tais.spring_course.entities.Order;
import com.tais.spring_course.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
