package com.nit.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartHandler implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent event) {

		System.out.println("ContextStartHandler.onApplicationEvent()");
        System.out.println("CONTEXT STARTED");

	}
}
