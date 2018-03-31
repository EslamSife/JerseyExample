package com.eslam.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("/customer")
public class CustomersRSservice {

	private static final Logger log = Logger.getLogger(CustomersRSservice.class);

	@POST
	@Path("/customerName")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Customer getCustomer(Customer customerName) {

		try {
			log.info("Log Jersey say : " + "getName method is called");
			log.info("customer name is" + customerName);
		} catch (Exception e) {
			log.info(e.toString());
		}
		return customerName;
	}

	@Produces(MediaType.APPLICATION_XML)
	@GET
	@Path("/customerAge/{custAge}")
	public Customer getCustomerName(@PathParam("custAge") Integer age) {
		Customer cs1 = new Customer();
		try {
			cs1.setAge(age);
			log.info("Log Jersey say : " + "getName method is called");
			log.info("customer age is" + cs1.getAge());
		} catch (Exception e) {
			log.info(e.toString());
		}
		return cs1;
	}

}
