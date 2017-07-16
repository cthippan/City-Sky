package com.climateheck.api.service;

import java.util.ArrayList;

import com.climateheck.api.entity.City;
import com.climateheck.api.entity.Weather;

public interface ClimateService {

	
	public void datastore(City city);
	public ArrayList<City> getcities();
	public Weather getweather( String city);
	public float getWeatherprop(String city,String property);	
}
