package net.cr;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public void getFortune() {
		 System.out.println("Inside HappyFortuneService class getFortune method");

	}

}
