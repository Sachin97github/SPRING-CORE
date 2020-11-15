package com.nit.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStopHandler implements ApplicationListener <ContextStoppedEvent>
{

	public void onApplicationEvent(ContextStoppedEvent event) {
		
		System.out.println("ContextStopHandler.onApplicationEvent()");
		System.out.println("CONTEXT STOPPED");
		
	}

}
