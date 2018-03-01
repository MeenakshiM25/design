package com.tavant.templatepattern.template.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tavant.templatepattern.template.CaffieneBeverageWithHook;

public class TeaWithHook extends CaffieneBeverageWithHook{

	@Override
	public void brew() {
		System.out.println("Steep tea bag in boiling water");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding few  lemon drops");
	}
	
	public boolean customerWantsCondiments(){
		return "Y".equalsIgnoreCase(getUserInput())?true:false;
		
	}

	private String getUserInput() {
		System.out.println("does the user wants lemon to be added to tea Y/N");
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
