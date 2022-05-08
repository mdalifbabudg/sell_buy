package com.example.sell_buy.repository;

import com.example.sell_buy.entity.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{
    Supplier findSupplier();
}
