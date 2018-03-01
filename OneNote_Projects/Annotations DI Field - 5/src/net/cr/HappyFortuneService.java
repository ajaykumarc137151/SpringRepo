package net.cr;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public void getFortune() {
		 System.out.println("get fortune method in interface");
	}
}
