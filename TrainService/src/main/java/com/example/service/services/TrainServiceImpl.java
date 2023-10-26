package com.example.service.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.repository.TrainRepository;
import com.example.service.entity.Train;
@Service
public class TrainServiceImpl implements TrainService {
	
	
	@Autowired
	private TrainRepository repo;

	@Override
	public List<Train> GetAllTrains() {
		return repo.findAll();
	}

	@Override
	public Train addTrain(Train trn) {
		return repo.save(trn);
	}

	@Override
	public Train updateTrain(Train trn) {
		return repo.save(trn);
	 
	}

	@Override
	public void deleteTrain(Train trn) {
 
		repo.delete(trn);
	}

	@Override
	public Train getTrainById(int train_id) {
		return repo.findById(train_id).get();
		 
	}

}
