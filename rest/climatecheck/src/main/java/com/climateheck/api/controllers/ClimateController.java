package com.climateheck.api.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.climateheck.api.entity.City;
import com.climateheck.api.entity.Weather;
import com.climateheck.api.service.ClimateService;

@RestController
@RequestMapping(value = "/cities")
public class ClimateController {
	
	
	private ClimateService service;
	
	public ClimateController(ClimateService service) {
		
		this.service = service;
	}

	// accept data and store in database
	@RequestMapping(method = RequestMethod.POST)
	public void datastore(@RequestBody City city) {

	}

	// get list of cities that have reported
	
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<City> getcities() {
		return service.getcities();
	}
	
	// get latest weather for given city
	
	@RequestMapping(method = RequestMethod.GET, value = "/{city}")
	public Weather getweather(@PathVariable("city") String city) {
		return service.getweather(city);
	}

	// get weather property for given city
	
	@RequestMapping(method = RequestMethod.GET, value = "/{city}/{property}")
	public float getWeatherprop(@PathVariable("city") String city, @PathVariable("property") String property) {
		return service.getWeatherprop(city, property);
	}

	// get hourly average weather
	public Weather getHourlyAvgweather() {
		return null;
	}

	// get daily average weather
	public Weather getDailyAvgweather() {
		return null;
	}

}
