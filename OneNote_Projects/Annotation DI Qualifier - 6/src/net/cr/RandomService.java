package net.cr;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public void getFortune() {
		System.out.println("random service");

	}

}
