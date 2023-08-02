package org.example;
import org.example.World.Abstractplanet;
import org.example.World.Population;

public class Planet extends Abstractplanet implements Runnable {


    public Planet(String name){
        super(name);


    }

    @Override
    public Population getPopulation() {
        return super.getPopulation();
    }

    @Override
    public void run() {

    }
}