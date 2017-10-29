package com.BlackJack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BlackJack.model.Activity;

@Service("exerciseService")
public class ExerciseService implements IExerciseService {

	/* (non-Javadoc)
	 * @see com.BlackJack.service.IExerciseService#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
	List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
		
	}
}
