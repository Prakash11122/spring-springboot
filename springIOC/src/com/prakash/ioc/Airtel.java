package com.prakash.ioc;

public class Airtel implements Sim {

	@Override
	public void Calling() {
		System.out.println("calling using airtel sim");
		
	}

	@Override
	public void Data() {
		System.out.println("browsing nternet using airtel som");
		
		
	}

}
