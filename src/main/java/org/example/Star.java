package org.example;
import org.example.Database.NameValidator;
import org.example.Database.TempAndType;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Star {
    private int temp;
    private String type;
    private String name;

    private final Position CENTRE = new Position(0,0);


    private String colour;

    private HashMap<String,Integer> starinfo = new HashMap<>();

    private final Random random = new Random();

    public Star(String name){
        this.name = name;
    }

    public void buildstar() throws IOException {
        TempAndType tempAndType = new TempAndType("Blue%20Giant");
        this.type = tempAndType.getType();
        this.temp = tempAndType.getDegreesKelvin();

    }


    public int getTemp() {
        return temp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}

