package com.sample.service.impl;


import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.sample.service.HelloWorldService;

public class HelloServiceActivator implements BundleActivator{

	ServiceRegistration helloWorldServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In Start");
		HelloWorldService helloWorldService = new HelloWorldServiceImpl();
		/*Dictionary<String, String> props = new Hashtable<String,String>();
		// osgi rs property to signal to distribution system 
		// that this is a remote service
		props.put("service.exported.interfaces","*");
		// specify the distribution provider with osgi rs property
		props.put("service.exported.configs", "ecf.jaxrs.jersey.server");
		// as per spec, <provider>.<prop> represents a property intended for use by this provider
		props.put("ecf.jaxrs.jersey.server.alias", "/jersey");*/
		helloWorldServiceRegistration = context.registerService(HelloWorldService.class.getName(), helloWorldService, null);
	}
	
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Good Bye");
		helloWorldServiceRegistration.unregister();
		
	}

}
