package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
    @Test
    public void differentStartingPositions(){
        Planet solaris = new Planet();
        Planet lunar = new Planet();
        assertTrue(!solaris.getStaringPos().equals(lunar.getStaringPos()));
    }

    @Test
    public void notOntopofSun(){
        Planet solaris = new Planet();
        Planet lunar = new Planet();
        final Position position = new Position(0,0);
        assertTrue(!solaris.getStaringPos().equals(position));
        assertTrue(!lunar.getStaringPos().equals(position));
    }

}