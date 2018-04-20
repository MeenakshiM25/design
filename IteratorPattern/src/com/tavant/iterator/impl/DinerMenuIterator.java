package com.tavant.iterator.impl;

import java.util.Iterator;

//import com.tavant.iterator.Iterator;
import com.tavant.iterator.menu.MenuItem;

public class DinerMenuIterator implements Iterator {
 
	MenuItem[] menuItems;
	int position = 0 ;
	
	public DinerMenuIterator (MenuItem[] items){
		this.menuItems = items;
	}
	@Override
	public boolean hasNext() {
		if(position >= menuItems.length || menuItems[position] == null){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position = position +1;
		return menuItem;
	}
	@Override
	public void remove() {
		if(position <=0) {
			throw new IllegalStateException("Cant remove item as its empty");
		}else {
			if(menuItems[position -1] != null){
				for (int i = position-1; i < menuItems.length -1;i++){
					menuItems[i] = menuItems[i+1];
				}
				menuItems[menuItems.length - 1] = null;
			}
		}
	}


}
