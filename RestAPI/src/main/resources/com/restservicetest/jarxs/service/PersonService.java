package com.restservicetest.jarxs.service;

import com.restservicetest.jarxs.model.Person;
import com.restservicetest.jarxs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}