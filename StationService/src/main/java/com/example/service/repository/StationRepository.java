package com.example.service.repository;

import java.sql.Time;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.service.entity.Station;
 
	@Repository
	public interface StationRepository extends JpaRepository<Station, Integer> 
	{
		@Query(nativeQuery = true,value="select s.station_id,s.station_name,s.station_code,s.arrival_time,s.departure_time ,s.platform_number from  Train_details  t join StationDetails s on t.train_id=s.train_id where s.train_id=:id")
	     public Station findStationByTrainID(@Param("id") int id);
	}
 