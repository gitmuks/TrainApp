package com.example.service.responses;

import java.sql.Time;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrainResponse 
{
    private int train_id;
    private String train_name;
    private String train_code;
    private Time  arrival_time;
    private Time  departure_time;
    private String firststation;
    private String laststation;
    private StationResponse station;
}