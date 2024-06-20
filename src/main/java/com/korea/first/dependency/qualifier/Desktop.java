package com.korea.first.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop") @Primary // primary 어노테이션을 붙이면 기본설정으로 됨
public class Desktop implements Computer {

	@Override
	public int getScreenWidth() {
		// TODO Auto-generated method stub
		return 1920;
	}
	
}
