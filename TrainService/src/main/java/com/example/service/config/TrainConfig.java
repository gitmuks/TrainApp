package com.example.service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


	

@Configuration
public class TrainConfig {
		@Bean
		public ModelMapper getmapper()
		{
			return new ModelMapper();
		}

		@Bean
		public RestTemplate getRestObj() {
		 return new RestTemplate();	
		}
	}
