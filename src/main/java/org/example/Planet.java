package org.example;
import java.lang.Math;
import java.util.Random;

public class Planet implements Runnable{

    private Position staringPos ;

    private int orbitBound ;

    Random random= new Random();



    public Position getStaringPos() {
        return staringPos;
    }

    public Planet(){
        this.staringPos = new Position((random.nextInt(200)+50),0);
        this.orbitBound = staringPos.getX();
    }

    @Override
    public void run() {

    }
}