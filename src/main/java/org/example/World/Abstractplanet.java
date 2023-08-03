package org.example.World;

import org.example.World.Population;
import org.example.Position;

public class Abstractplanet {

    private Population population = new Population(1000);
    private int food;
    private int capital_resources;

    private Position currentPos;

    private int distance_from_star;
    private String name;

    private double percentageOfReflectedLight = 0.30;

    private int temperature ;
    //this counts for land etc.

    public Abstractplanet(String name){

        this.name = name;
        this.currentPos = new Position(100,0);
        this.distance_from_star = currentPos.getMaxDistance();

    }

    public Position getCurrentPos() {
        return currentPos;
    }

    public void orbit(){}

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


    public int getDistance_from_star() {
        return distance_from_star;
    }

    public double getPercentageOfReflectedLight() {
        return percentageOfReflectedLight;
    }

    public int getFood() {
        return food;
    }
}
