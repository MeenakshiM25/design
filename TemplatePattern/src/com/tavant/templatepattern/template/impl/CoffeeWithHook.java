package com.tavant.templatepattern.template.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tavant.templatepattern.template.CaffieneBeverageWithHook;

public class CoffeeWithHook extends CaffieneBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Brew some  coffe powder");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
		
	}
	public boolean customerWantsCondiments(){
		return "Y".equalsIgnoreCase(getUserInput())?true:false;
		
	}

	private String getUserInput() {
		System.out.println("does the user wants Sugar and milk to be added to coffee Y/N");
		BufferedReader bufferedReader = new BufferedReader(new  InputStreamReader(System.in));
		String answer = null;
		try {
			 answer = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return  (String) ((null == answer)?'N':answer);		
		
	}

}
