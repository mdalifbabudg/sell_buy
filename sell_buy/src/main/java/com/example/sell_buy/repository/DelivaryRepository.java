package com.example.sell_buy.repository;

import com.example.sell_buy.entity.Delivary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DelivaryRepository extends JpaRepository<Delivary, Long>{
    
}
