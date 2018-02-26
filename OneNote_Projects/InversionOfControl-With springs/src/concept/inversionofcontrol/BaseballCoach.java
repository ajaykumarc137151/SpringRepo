package concept.inversionofcontrol;

public class BaseballCoach implements Coach {

    /**
     * The method that we have inherited from the coach. This method is also
     * implemented in other objects
     */

    @Override
    public String getWorkOut() {
        return "This is baseball class method";
    }

    public void display(){
        System.out.println("Inside display method");
    }

}
