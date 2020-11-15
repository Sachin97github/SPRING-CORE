package com.nit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pengine")
public class PetrolEngine implements Engine {

	public void start() {
		 System.out.println("PetrolEngine.start()");
		
	}

	public void stop() {
		System.out.println("PetrolEngine.stop()");
		
	}

}
