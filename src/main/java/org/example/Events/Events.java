package org.example.Events;

import org.example.Resources.Resource;
import org.example.World.Population;

public interface Events {

    public void trigger(Resource resource);

    public void triggerPopulation();

    public void sysOut();



    public void execute();

}
