package com.nit.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestRateReplacer implements MethodReplacer {

	private float rate;
	
	public void setRate(float rate) {
		this.rate = rate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
         
		System.out.println("InterestRateReplacer.reimplement()");
        System.out.println(obj.getClass() +" "+method.getName()+""+Arrays.deepToString(args));
        
        float pAmnt=0.0f;
        float time=0.0f;
        
        pAmnt=(Float)args[0];
        time=(Float)args[1];
        
		return (pAmnt*rate*time)/100.0f;
	}

}
