package com.example.service.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

import com.example.service.entity.Train;
import com.example.service.responses.TrainResponse;
import com.example.service.responses.StationResponse;
import com.example.service.services.TrainService;

@RestController
@RequestMapping("/trains/")
public class TrainController 
{
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restObj;
	
	@Autowired
	private TrainService serv;
	
	
	@Value("${stationservice.base.url}")
	private String BaseURL;
	
	@Autowired
	private DiscoveryClient dclient ;
	
	@Autowired
	private LoadBalancerClient loadbal;
	
	@GetMapping("/{id}")
	public ResponseEntity<TrainResponse> GetById(@PathVariable int  id)
	{
		
		//List<ServiceInstance> services = dclient.getInstances("ADDRESS-API");
		ServiceInstance service= loadbal.choose("STATION-API");
		String uri=service.getUri().toString();
		//String  uri = services.get(1).getUri().toString();
		System.out.println("URI is ...................."+ uri);
		Train trn=serv.getTrainById(id);
		TrainResponse resp=modelMapper.map(trn, TrainResponse.class);
		//AddressResponse addres= restObj.getForObject(BaseURL+ "/address/"+id, AddressResponse.class);
		StationResponse station= restObj.getForObject(uri+ "/station-app/api/station/"+ id, StationResponse.class);
		resp.setStation(station);
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}