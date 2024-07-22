package com.prakash.ioc;

public class Vodafone implements Sim{

	@Override
	public void Calling() {
		System.out.println("calling using vodafone sim");
		
	}

	@Override
	public void Data() {
		System.out.println("browsing internet using vodafone sim");
		
	}

}
