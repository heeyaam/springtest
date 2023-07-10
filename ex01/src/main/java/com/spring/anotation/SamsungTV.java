package com.spring.anotation;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("xml 방식) 삼성 tv를 켰습니다.");

	}

}
