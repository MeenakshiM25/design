package com.tavant.observerpattern.publisher;

import com.tavant.observerpattern.subscriber.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
