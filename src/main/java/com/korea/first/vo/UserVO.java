package com.korea.first.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
@Getter
public class UserVO {
	private String name;
	private int age;
	
	
	
	public UserVO(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public UserVO() {
		
	}
	
	
	
	
	
}
