package org.example.Events;

import org.example.Planet;
import org.example.Resources.Resource;
import org.example.World.Population;
import org.example.Star;
public class AsteroidImpact implements Events{
    Population population;
    Planet planet ;

    Resource resource;


    public AsteroidImpact(Planet planet){
       this.population = planet.getPopulation();
       this.planet = planet;

    }


    @Override
    public void trigger(Resource resource) {
        int resourceCount = resource.getAmount();
        this.planet.getLand().reduce(2500);
        //angles
        //size
        //radiation
    }

    @Override
    public void triggerPopulation() {
        int currentPopulation = population.getCount();
        this.planet.getPopulation().setCount(currentPopulation/2);
        this.planet.getMaterials().increase(2500);

    }

    @Override
    public void sysOut() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Event: Meteor has crashed into you planet ! ");
    }

    @Override
    public void execute() {
        sysOut();
    }


}
