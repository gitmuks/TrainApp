package com.example.service.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.service.entity.Train;
 
@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}
 
