package com.nit.beans;

public class Vehicle {

	
	private Engine engine;
	
	
	
	
	public Engine getEngine() {
		return engine;
	}




	public void setEngine(Engine engine) {
		this.engine = engine;
	}




	public void journey(String start,String stop)
	{
		
		
		System.out.println("Vehicle.journey()");
		
		engine.start();
		engine.stop();
		
		
		
	}

	
	
	
}
