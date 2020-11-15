package com.nit.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nit.beans.GoodNight;

@Configuration
public class AppConfig1 {
	
	@Bean( initMethod = "init" , destroyMethod = "destroy") 
	@Scope("singleton")
	public GoodNight goodNight()
	{
		return new GoodNight();
	}

}
