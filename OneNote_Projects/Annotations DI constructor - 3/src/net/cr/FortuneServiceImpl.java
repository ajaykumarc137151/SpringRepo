package net.cr;

/**
 * Created by ajay on 2/28/2018.
 *
 * This class is to find out if two beans are present for Autowiring and which one will it chooses from those.
 * If this @code @Component is removed, you can test the scenario
 */


//@Component
public class FortuneServiceImpl implements FortuneService {

    @Override
    public void getFortune() {
        System.out.println("Inside FortuneServiceImpl class getFortune method");
    }
}
