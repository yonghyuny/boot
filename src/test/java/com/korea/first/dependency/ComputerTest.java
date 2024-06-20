package com.korea.first.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
//@SpringBootTest
//스프링부트는 해당 어노테이션을 통해 스프링부트 프로젝트 테스트에 필요한
//모든 의존성을 제공한다.
@Slf4j
public class ComputerTest {
	
	@Autowired
	Coding coding; //스프링에서 직접 만든 객체를 주입받아 사용한다.
	
	@Test
	public void computerTest() {
		// 우리가 new를 통해 직접 만든 코딩객체
		// Coding coding = new Coding();
		
		
		//log.info()는 자동으로 toString()메서드를 붙혀주지 않기 때문에
		//직접 붙혀야 한다.
		log.info(coding.getComputer().toString());
	}
}
