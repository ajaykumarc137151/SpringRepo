package net.cr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * this is the configuration file for spring container.
 *
 * @author chku0616
 * @ComponentScan (" package name ") is necessary with out that we cannot get the
 * tennisCoach bean in the "JavaConfig file". Hence it is
 * necessary even though i have told it as optional, but in this
 * case, it is required.
 */
@Configuration
@ComponentScan("net.cr")
public class SportConfig {

}
