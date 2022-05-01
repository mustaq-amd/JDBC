package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ServiceBean {
	


	
	@Autowired
	private Environment env;
	
	@Bean("clist")
	public List<String> getCities() {
		
		List<String> list=new ArrayList<>();
		
		list.add(env.getProperty("city1"));
		list.add(env.getProperty("city2"));
		list.add(env.getProperty("city3"));
		list.add(env.getProperty("city4"));
		list.add(env.getProperty("city5"));
		
		
		return list;
		
	}
	
	

}
