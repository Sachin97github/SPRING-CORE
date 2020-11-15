package com.nit.beans;

public class GoodNight {

	public GoodNight() {
		System.out.println("GoodNight.GoodNight() ---> O Param Constructer");
	}

	public void init() {
		System.out.println("GoodNight.init() ---> Object Created");
	}

	public void message() {
		System.out.println("GoodNight Spring");
	}

	public void destroy()
	{
		System.out.println("GoodNight.destroy() ---> Object Destroyed");
	}
	
}
