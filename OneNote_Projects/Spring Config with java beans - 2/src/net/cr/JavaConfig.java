package net.cr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * this is the configuration file for spring container.
 *                
 *  here we have used the configuration class, instead of XML.
 *  
 * 
 * @author ajay
 *
 */
@Configuration
@PropertySource("classpath:sport.properties")
public class JavaConfig {

	// define method for injecting the dependency
	@Bean
	public FortuneService getFortuneService(){
		return new HappyFortuneService();
	}
	
	//define method for swimCoach
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(getFortuneService());
	}
	
}
