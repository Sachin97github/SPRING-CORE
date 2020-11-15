package com.nit.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.nit.beans.GoodMorning;

@Configuration
@Import(AppConfig1.class)  //Import--> We dnt have to Config every Configuration Class Explicitly 
                           //import all class in one a Give that class to IOC container for Collecting meta data
public class AppConfig {

	@Bean
	@Scope("singleton")
	public GoodMorning goodMorning()
    {
	   return new GoodMorning();
	}

}
