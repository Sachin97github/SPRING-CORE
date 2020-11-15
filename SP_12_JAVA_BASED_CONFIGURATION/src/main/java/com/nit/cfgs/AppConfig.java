package com.nit.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nit.beans.GoodMorning;
import com.nit.beans.Greetings;

@Configuration
public class AppConfig {
	
	@Bean
	public Greetings greetings()  //if you dont specify Bean name function name will work as bean id
 	{
		return new Greetings(goodMorning()); //goodMorning() func will provide an object of Good morning
	}
	
	@Bean
	public GoodMorning goodMorning()
	{
		return new GoodMorning();
	}
	


}
