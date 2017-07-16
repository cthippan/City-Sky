package com.climateheck.api.entity;

public class Weather {

private String description;
private float humidity;
private float temperature;


public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getHumidity() {
	return humidity;
}
public void setHumidity(float humidity) {
	this.humidity = humidity;
}
public float getTemperature() {
	return temperature;
}
public void setTemperature(float temperature) {
	this.temperature = temperature;
}

}
