package com.climateheck.api.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.climateheck.api.entity.City;
import com.climateheck.api.entity.Weather;
import com.climateheck.api.exception.NotFoundException;
import com.climateheck.api.repository.ClimateRepository;
import com.climateheck.api.service.ClimateService;
@Service
public class ClimateServiceImpl implements ClimateService{
	
	private ClimateRepository repository;
	

	public ClimateServiceImpl(ClimateRepository repository) {
		
		this.repository = repository;
	}

	@Override
	public void datastore(City city) {
		City exists= repository.findByname(city.getCity());
		if(exists==null){
			//UPdate records
		}
		else{
			//store in database
		}
	}

	@Override
	public ArrayList<City> getcities() {
		
		return repository.getcities();
	}

	@Override
	public Weather getweather(String city) {
		Weather existing = repository.getweather(city);
		if(existing==null){
		throw new NotFoundException("city "+city+" doesn't exist");	
		}
		return existing;
	}

	@Override
	public float getWeatherprop(String city, String property) {
		City existing = repository.findByname(city);
		float prop = 0;
		if(existing==null){
			 prop= repository.getWeatherprop(city, property);
		}
		else {
			throw new NotFoundException("city "+city+" doesn't exist");	
		}
		
		return prop;
	}

}
