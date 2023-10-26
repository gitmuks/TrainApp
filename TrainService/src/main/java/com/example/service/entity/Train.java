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
@Table(name="Train_details")
public class Train
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int train_id;
	
	@Column(nullable = false)
    private String train_name;
	
	@Column(nullable = false)
    private String train_code;
	
	@Column(nullable = false)
    private Time  arrival_time;
	
		@Column(nullable = false)
    private Time  departure_time;
	
	@Column(nullable = false)
    private String firststation;
	
	@Column(nullable = false)
    private String laststation;
		
}