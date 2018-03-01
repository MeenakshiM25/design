package com.tavant.observerpattern.publisher.impl;

import java.util.ArrayList;
import java.util.List;

import com.tavant.observerpattern.publisher.Subject;
import com.tavant.observerpattern.subscriber.Observer;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		setObservers(new ArrayList<Observer>());
	}
	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
