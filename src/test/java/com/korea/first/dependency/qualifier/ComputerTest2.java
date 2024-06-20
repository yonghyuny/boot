package com.korea.first.dependency.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTest2 {
	
//	@Autowired @Qualifier("desktop")
//	Computer desktop;
//	
//	@Autowired @Qualifier("laptop")
//	Computer laptop;
	
	// desktop에 primary를 붙혔기 때문에 컴퓨터 객체를 만들어도 desktop이 주입됨!!!!
	@Autowired
	Computer computer;
	
	
	@Test
	public void getScreenWidth() {
//		log.info(""+desktop.getScreenWidth());
//		log.info(""+laptop.getScreenWidth());
		log.info(""+computer.getScreenWidth());
	}

}
