package concept.inversionofcontrol;

/**
 * This class is example for application without springs
 */
public class MyApp {

    public static void main(String[] args) {

        /**
         * here we create the objects of TrackCoach and BaseballCoach. As our
         * application should be easily have to change for other coaches, we
         * will create a new interface and those methods will be implemented in
         * other classes (TrackCoach and BaseballCoach).
         *
         * If we look at the below code, we just change the object. we need not
         * to change other code.
         */

        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getWorkOut());

        /**
         * The below code also works. for neat understanding, I have written
         * again
         */

        // theCoach = new BaseballCoach();
        // System.out.println(theCoach.getWorkOut());

        Coach theCoach1 = new BaseballCoach();
        System.out.println(theCoach1.getWorkOut());

    }

}
