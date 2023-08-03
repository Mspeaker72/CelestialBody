package org.example;
import org.example.Database.NameValidator;
import org.example.commands.View_info;

import java.io.IOException;
import java.util.*;

public class SolarSystem {

    private Star star;
    private final Scanner scanner = new Scanner(System.in);

    HashMap<String,Planet> planetHashMap = new HashMap<>();

    String current_Planet;




    public Scanner getScanner() {
        return scanner;
    }

    public void starnamingconvention() throws IOException {
        NameValidator nameValidator = new NameValidator("Alpha Sirius");
        this.star = new Star(nameValidator.getName());
    }

    public boolean hasStar(){
        if(this.star!=null){
            View_info view = new View_info(planetHashMap,current_Planet) ;
            view.hasStar(star);
            view.display();
            return true;
        }
        return false;
    }

    public void setupSystem(){
        System.out.println("What would you like to call your new home ?:\n");
        String input = getScanner().nextLine();
        current_Planet = input;
        Planet planet = new Planet(input);
        planet.getTemperature(this.star.getTemp(),planet.getDistance_from_star(),planet.getPercentageOfReflectedLight());
        this.planetHashMap.put(planet.getName(),planet);
    }

    public void creation() throws IOException {
        starnamingconvention();
        this.star.buildstar();
        setupSystem();
        hasStar();
        System.exit(-1);
    }
}
