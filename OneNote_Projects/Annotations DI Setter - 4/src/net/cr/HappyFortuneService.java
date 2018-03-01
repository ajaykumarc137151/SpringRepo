package net.cr;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
        System.out.println("This is HappyFortuneService default constructor");
    }

    public void getFortune() {
		 System.out.println("get fortune method in HappyFortuneService class");

	}

}
