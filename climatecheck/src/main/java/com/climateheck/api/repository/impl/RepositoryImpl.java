package com.climateheck.api.repository.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.climateheck.api.entity.City;
import com.climateheck.api.entity.Weather;
import com.climateheck.api.repository.ClimateRepository;
@Repository
public class RepositoryImpl implements ClimateRepository {

	@Override
	public void datastore(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<City> getcities() {
		ArrayList<City> cityList=new ArrayList<>();
		City city1=new City();
		city1.setCity("Chicago");
		City city2=new City();
		city2.setCity("Bloomington");
			cityList.add(city1);
			cityList.add(city2);
		return cityList;
	}

	@Override
	public Weather getweather(String city) {
		// TODO Auto-generated method stub
		
		Weather weather =new Weather();
		weather.setDescription("hot");
		
		return weather;
	}

	@Override
	public float getWeatherprop(String city, String property) {
		// TODO Auto-generated method stub
		return 0;
	}

	public City findByname(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
