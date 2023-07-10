package com.spring.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //@Autowiredrk 필요하다면 그전에 넣어줘야함
public class Restaurant {
	
	@Autowired   //기존에 있던 bean 과 관계가있다 주입하겠다
	Chef chef;
	
	public void open() {
		chef.cooking();
	}
}
