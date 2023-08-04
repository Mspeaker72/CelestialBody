package org.example.World;

import org.example.Planet;

import java.util.HashMap;

public class People implements PersonOfInterest{

    public People(Planet planet){
        if (planet.getPopulation().getCount()>0){
            Trait trait = new Trait("Gamblers Luck","doubles chance " +
                    "for good outcomes within events (can also stop meteors)");
            individual person = new individual("Black Jack",21,trait);
            this.influential_inhabitants.put(person.getIndividual(),person.getTrait());
        }
    }

    HashMap<String,Trait> influential_inhabitants = new HashMap<>();

    @Override
    public String getIndividual(String name) {
        return influential_inhabitants.keySet().toString().
                replace("[","").replace("]","");
    }

    @Override
    public String getIndividual() {
        return influential_inhabitants.keySet().toString().
                replace("[","").replace("]","");
    }

    @Override
    public Trait getTrait() {
        return null;
    }

    @Override
    public String getTrait(String name) {
        return influential_inhabitants.get(name).TraitInfo();
    }

    @Override
    public int getAge() {
        return 0;
    }
}
