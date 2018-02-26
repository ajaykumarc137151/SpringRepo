package concept.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {


        // load the spring configuration file
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans from the container
        Coach coach = context.getBean("myCoach", Coach.class);

        //call the method with the coach object
        System.out.println(coach.getWorkOut());

        // close the context object
        context.close();

    }

}
