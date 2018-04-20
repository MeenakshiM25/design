package com.tavant.composite.menu.iterator;

import java.util.Iterator;
/** Might be considered as example for null object pattern **/
public class NullIterator implements Iterator{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();		
	}

}
