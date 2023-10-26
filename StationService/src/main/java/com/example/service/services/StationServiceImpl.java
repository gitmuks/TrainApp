package com.example.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.entity.Station;
import com.example.service.repository.StationRepository;
@Service
public class StationServiceImpl implements StationService {

 
		@Autowired
	    private StationRepository repo;
		
		@Override
		public Station getTrainStationDetailsBasedonId(int id) {		
			return repo.findStationByTrainID(id);
		}


}
