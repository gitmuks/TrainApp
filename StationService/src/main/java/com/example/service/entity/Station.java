package com.example.service.entity;

import java.sql.Time;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="StationDetails")
public class Station 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int station_id;
	
	@Column(nullable = false)
    private String station_name;
	
	
	@Column(nullable = false)
    private String station_code;
	
	@Column(nullable = false)
    private Time  arrival_time;
	
	
	@Column(nullable = false)
    private Time  departure_time;
	
	@Column(nullable = false)
    private String platform_number;
	

}