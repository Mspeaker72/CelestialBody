package org.example.commands;

import org.example.Planet;
import org.example.Star;
import org.example.World.People;
import org.example.World.Trait;

import java.util.HashMap;

public class View_info {
    private HashMap<String, Planet> planetHashMap;
    private String current_Planet;

    private Star star;

    public View_info(HashMap planets , String planet){
        this.current_Planet= planet;
        this.planetHashMap = planets;

    }

    public void display(){
        System.out.println("--------------------------------------------------------------\n");
        System.out.println("Displaying information about the planet "+planetHashMap.get(current_Planet).getName()+" :");
        System.out.println(planetHashMap.get(current_Planet).getName()+"'s surface temperature is "
                +planetHashMap.get(current_Planet).getSurfaceTemperature()+" degrees celsius");
        System.out.println("current population "+planetHashMap.get(current_Planet).getPopulation().getCount()+" people");

        System.out.println("The the current position of the planet: "+planetHashMap.get(current_Planet)
                .getCurrentPos().getX()+","+planetHashMap.get(current_Planet).getCurrentPos().getY());

        System.out.println("These are the current resources at your disposal the planet: \n"+
                "Food : "+planetHashMap.get(current_Planet).getFood().getAmount()
        +"\n"+"Land : "+planetHashMap.get(current_Planet).getLand().getAmount()+"\n"+
                "Materials : "+planetHashMap.get(current_Planet).getMaterials().getAmount());
    }

    public void hasStar(Star parent_star) {
        this.star = parent_star;
        System.out.println("--------------------------------------------------------------\n");
        System.out.println("This system has parent star: "+this.star.getName()+" which is a "+star.getType()
                + " star and it burns at "+this.star.getTemp()+" Kelvin.");
    }

    public void peopleOfInterest(People people){
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Notable citizens \n");
        System.out.println(people.getIndividual()+" has the ability : "+people.getTrait("Black Jack"));

    }
}
