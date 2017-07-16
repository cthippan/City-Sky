package com.climateheck.api.repository;

import java.util.ArrayList;

import com.climateheck.api.entity.City;
import com.climateheck.api.entity.Weather;

public interface ClimateRepository {
	public void datastore(City city);
	public ArrayList<City> getcities();
	public Weather getweather( String city);
	public float getWeatherprop(String city,String property);
	public City findByname(String city);	
}
