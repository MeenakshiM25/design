package com.tavant.observerpattern.main;

import com.tavant.observerpattern.publisher.impl.WeatherData;
import com.tavant.observerpattern.subscriber.impl.CurrentConditionsDisplay;
import com.tavant.observerpattern.subscriber.impl.ForecastDisplay;
import com.tavant.observerpattern.subscriber.impl.StatisticsDisplay;

/*Observer Pattern defines one to many dependency between objects so that when object changes its state,all of its dependents are notified and updated automatically*/
public class ObserverPatternSimulator{
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticalDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80,65,30.4f);
		System.out.println("............................");
		weatherData.setMeasurements(82,70,29.2f);
		System.out.println("............................");
		weatherData.setMeasurements(75,75,28.1f);
		System.out.println("............................");
		weatherData.removeObserver(currentConditionsDisplay);
		weatherData.setMeasurements(71,77,27.1f);
		System.out.println("............................");
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(70,78,28.1f);
		System.out.println("............................");
	}
}
