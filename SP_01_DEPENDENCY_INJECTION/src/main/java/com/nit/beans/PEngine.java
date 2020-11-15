package com.nit.beans;

public class PEngine implements Engine {

	private String type;
	
	
	
	public PEngine(String type) {
		super();
		this.type = type;
	}

	public void start() {
		System.out.println("PEngine.start()" +type);
		
	}

	public void stop() {
		System.out.println("PEngine.stop()");
		
	}

}
