package net.cr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfig {

    public static void main(String[] args) {

        /**
         * Here nothing will change whether we have defined beans or not. the
         * default bean id is only seen here. no where in other code. the two
         * objects will have different memory locations.
         *
         * The constructor is called whenever there is a new request from the
         * container for the object creation
         *
         * previously we have used ClassPathXMLApplicationContext class for
         * reading the spring configuration file from XML. Now it is
         * AnnotationConfigApplicationContext class we need to use to read the
         * spring configuration from the java class
         */

        // read the spring configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the container
        Coach theCoach = (Coach) context.getBean("tennisCoach");

        Coach theCoach1 = (Coach) context.getBean("tennisCoach");

        // print the object memory
        System.out.println(theCoach);

        // print the object memory
        System.out.println(theCoach1);

        // Close the context.
        context.close();

    }

}
