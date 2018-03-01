package com.tavant.observerpattern.subscriber.impl;

import com.tavant.observerpattern.publisher.impl.WeatherData;
import com.tavant.observerpattern.subscriber.DisplayElement;
import com.tavant.observerpattern.subscriber.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	
	public CurrentConditionsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
	 this.temperature = temp;
	 this.humidity = humidity;
	 this.pressure = pressure;
	 display();
	}

	@Override
	public void display() {
		System.out.println("Printing the current weather conditions: Temperature- "+temperature+" F ,humidity- "+humidity+ " C");
		
	}

}
