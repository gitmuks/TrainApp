package com.example.service.services;
 
import java.util.List;

import com.example.service.entity.Train;

public interface TrainService {

		public List<Train> GetAllTrains();
		public Train addTrain(Train trn);
		public Train updateTrain(Train trn);
		public void deleteTrain(Train trn);
		public Train getTrainById(int train_id);
}