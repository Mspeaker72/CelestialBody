package org.example;
import org.example.Database.NameValidator;
import org.example.Events.AsteroidImpact;
import org.example.World.People;
import org.example.World.Trait;
import org.example.commands.View_info;

import java.io.IOException;
import java.util.*;

public class SolarSystem {

    Trait activateTraits;

    private Star star;
    private final Scanner scanner = new Scanner(System.in);

    HashMap<String,Planet> planetHashMap = new HashMap<>();

    String current_Planet;

    View_info viewInfo;




    public Scanner getScanner() {
        return scanner;
    }

    public void starNamingConvention() throws IOException {
        NameValidator nameValidator = new NameValidator("Alpha Sirius");
        this.star = new Star(nameValidator.getName());
    }

    public boolean hasStar(){
        if(this.star!=null){
            viewInfo = new View_info(planetHashMap,current_Planet) ;
            viewInfo.hasStar(star);
            viewInfo.display();
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

    public void RandomEvent(){
        AsteroidImpact asteroidImpact = new AsteroidImpact(planetHashMap.get(current_Planet));
        asteroidImpact.triggerPopulation();
        asteroidImpact.trigger(planetHashMap.get(current_Planet).getLand());
        asteroidImpact.sysOut();
    }

    public void generateCitizen(){
        People people = new People(planetHashMap.get(current_Planet));
        viewInfo.peopleOfInterest(people);


    }


    public void creation() throws IOException {
        starNamingConvention();
        this.star.buildstar();
        setupSystem();
        hasStar();
        generateCitizen();
        RandomEvent();
        hasStar();
        System.exit(-1);
    }
}
