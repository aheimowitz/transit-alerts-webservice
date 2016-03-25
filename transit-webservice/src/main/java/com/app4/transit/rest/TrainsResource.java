package com.app4.transit.rest;


import org.springframework.stereotype.Component;

@Component
@Path("/trains")
public class TrainsResource {
	
	@GET
	public String getTrainList(){
		return "Hello World";
	}

}