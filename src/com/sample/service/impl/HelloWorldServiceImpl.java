package com.sample.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sample.service.HelloWorldService;


@Path("/helloworld")
public class HelloWorldServiceImpl implements HelloWorldService{

	static int count;
	@GET
	@Produces("text/plain")
	public String getMeassage() {
		count++;
		System.out.println("Total request processed : "+count);
		return "In getMessage() method @service side";
	}
}