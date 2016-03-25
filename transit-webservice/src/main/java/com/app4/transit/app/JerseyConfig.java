package com.app4.transit.app;

import org.springframework.context.annotation.Configuration;

import com.app4.transit.rest.TrainsResource;

@Configuration
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig(){
		register(TrainsResource.class);
	}

}
