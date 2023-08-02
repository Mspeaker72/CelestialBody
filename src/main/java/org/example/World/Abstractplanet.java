package org.example.World;

import org.example.World.Population;
import org.example.Position;

public class Abstractplanet {

    private Position startingPos;
    private Population population = new Population(100000);
    private int food;
    private int capital_resources;

    private int distance_from_star;
    private String name;

    private double percentageOfReflectedLight = 0.30;

    private int temperature ;
    //this counts for land etc.

    public Abstractplanet(String name){
        this.name = name;
    }

    public Position getPosition(){
        return startingPos;
    }

    public String getName() {
        return name;
    }

    public int getCapital_resources() {
        return capital_resources;
    }

    public int getTemperature(int parent_star_temp ,int distance , double reflected_sunliight) {
        int surface_temperature = (int) ((parent_star_temp / distance) * reflected_sunliight);
        temperature = surface_temperature;
        return temperature;
    }

    public int getSurfaceTemperature(){
        return temperature;
    }

    public Population getPopulation() {
        return population;
    }

    public Position getStartingPos() {
        return startingPos;
    }

    public int getDistance_from_star() {
        return 100;
    }

    public double getPercentageOfReflectedLight() {
        return percentageOfReflectedLight;
    }

    public int getFood() {
        return food;
    }
}
