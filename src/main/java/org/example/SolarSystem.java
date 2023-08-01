package org.example;
import org.example.Database.NameValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolarSystem {

    private Star star;
    private Random random = new Random();


    public void starnamingconvention() throws IOException {
        NameValidator nameValidator = new NameValidator("Alpha Sirius");
        this.star = new Star(nameValidator.getName());
    }

    public boolean hasStar(){
        if(this.star!=null){
            System.out.println("This system has parent star: "+this.star.getName()+" which is a "+star.getType()
            + " star and it burns at "+this.star.getTemp()+" Kelvin.");
            return true;
        }
        return false;
    }

    public void creation() throws IOException {
        starnamingconvention();
        this.star.buildstar();
        hasStar();
        System.exit(-1);
    }
}
