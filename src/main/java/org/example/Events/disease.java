package org.example.Events;

import org.example.Resources.Resource;

public class disease extends diseases implements Events{

    public disease(String name){
        super(name);
    }
    @Override
    public void trigger(Resource resource) {

    }

    @Override
    public void triggerPopulation() {

    }
}
