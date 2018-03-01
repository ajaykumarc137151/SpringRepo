package net.cr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ajay on 2/28/2018.
 */

@Component
public class CricketCoach implements Coach {

    @Value("ajay")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void workOut() {

    }
}
