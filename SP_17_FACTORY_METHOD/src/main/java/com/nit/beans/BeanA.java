package com.nit.beans;

public class BeanA {

	private static final BeanA beanA = new BeanA();

	private BeanA() {
		System.out.println("Private Constructer is Called  --> BeanA Object is created"); //Object is Created When Program is Loaded
	}

	public static BeanA getBeanA() {
		System.out.println("BeanA.getBeanA() --- > STATIC FACTORY METHOD");
		return beanA;
	}

}
