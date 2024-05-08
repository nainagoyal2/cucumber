package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S05Registration {
	@Given("open the registration page")
	public void open_the_registration_page() {
		System.out.println("Registration page open");
	  
	}

	@When("Pass the data as follow")
	public void pass_the_data_as_follow(io.cucumber.datatable.DataTable dataTable) {
	 List<List<String>>data = dataTable.asLists();
	 for (List<String> l:data)
		 System.out.println(l);
	  
	}

	@Then("Regisration should be success")
	public void regisration_should_be_success() {
		System.out.println("Registration page open the succes fully");
	   
	}
	
	@When("Passisg the data as following")
	public void passisg_the_data_as_following(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>>data = dataTable.asMaps(); 
	for(Map<String, String> m: data)
		System.out.println(m);
	for(Map<String, String> m: data)
	{
		System.out.println("f_name:" +m.get("f_name"));
	System.out.println("Gender:" +m.get("Gender"));
	System.out.println("address" +m.get("Address"));
	System.out.println("phone:" +m.get("Phone"));
	System.out.println("city:" +m.get("City"));
	}
	} 

	@Then("Regisration page should be success")
	public void regisration_page_should_be_success() {
		System.out.println("Registration page open the succes fully !!!!"); 
	}




}
