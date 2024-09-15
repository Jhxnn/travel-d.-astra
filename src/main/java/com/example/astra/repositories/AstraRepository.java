package com.example.astra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.astra.astraEntity.Astra;
@Repository
public interface AstraRepository extends JpaRepository<Astra, Long> {

}	
