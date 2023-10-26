package com.example.service.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.service.entity.Station;

import com.example.service.responses.StationResponse;
import com.example.service.services.StationService;

@RestController
 
@RequestMapping("/station/")
public class StationController 
{
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StationService serv;
	
	@GetMapping("/{id}")
	public ResponseEntity<StationResponse> getById(@PathVariable int id)
	{
		Station add=serv.getTrainStationDetailsBasedonId(id);
		StationResponse resp=modelMapper.map(add, StationResponse.class);
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}