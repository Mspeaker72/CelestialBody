package org.example;


import org.example.Admin.prompts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        prompts prompts = new prompts();
        prompts.welcome();
        SolarSystem newWorld = new SolarSystem();
        newWorld.creation();

    }
}