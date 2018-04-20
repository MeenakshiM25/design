package com.tavant.iterator.impl;

import java.util.ArrayList;

import com.tavant.iterator.Iterator;
import com.tavant.iterator.menu.MenuItem;
/** Not Used as replaced by java util iterator **/
public class PanCakeIterator implements Iterator{
	ArrayList<MenuItem> menuItems;
	int position = 0 ;
	
	public PanCakeIterator (ArrayList<MenuItem> items){
		this.menuItems = items;
	}
	@Override
	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position = position +1;
		return menuItem;
	}

}
