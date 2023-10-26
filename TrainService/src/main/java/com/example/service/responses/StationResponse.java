package com.example.service.responses;
 

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StationResponse {
	   private int station_id;
	   private String station_name;
	   private String station_code;
	   private Time arrival_time;
	   private Time departure_time;
	   private String platform_number;


	}
 
