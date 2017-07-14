package com.sample.service;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

public interface HelloWorldService {
	@GET
	@Produces("text/plain")
	public String getMeassage();
}
