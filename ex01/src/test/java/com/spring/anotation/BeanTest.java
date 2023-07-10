package com.spring.anotation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.junit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BeanTest {
	//@Test
	public void test() {
		System.out.println("단순테스트");
	}
	
	@Autowired
	//container 주체자체를 끌고옴
	ApplicationContext ctx;
	
	//@Test
	public void createBeanTest() {
		TV tv = (TV)ctx.getBean("tv");
		assertNotNull(tv);
	}
	
	
	@Autowired
	Restaurant res;
	@Test
	public void createRestaurantTest() {
		res.open();
	}
}
