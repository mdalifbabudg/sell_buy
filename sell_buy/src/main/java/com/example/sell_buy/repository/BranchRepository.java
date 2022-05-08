package com.example.sell_buy.repository;

import com.example.sell_buy.entity.Branch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long>{
    
}
