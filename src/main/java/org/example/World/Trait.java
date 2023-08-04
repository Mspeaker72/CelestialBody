package org.example.World;

public class Trait {

    String name;
    String affect;

    public Trait (String name,String affect){
        this.name = name;
        this.affect = affect;


    }

    public String TraitInfo(){
        return name+" "+affect;
    }



}
