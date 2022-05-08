package com.example.sell_buy.repository;

import com.example.sell_buy.entity.Headquarters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadquartersRepository extends JpaRepository<Headquarters, Long>{
    
}
