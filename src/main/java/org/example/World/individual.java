package org.example.World;

public class individual implements PersonOfInterest{

    private Trait trait;
    private String name;

    private int age;

    public individual(String name,int age,Trait trait){
        this.trait = trait;
        this.age = age;
        this.name = name;

    }

    @Override
    public String getIndividual(String name) {
        return name;
    }

    @Override
    public String getIndividual() {
        return name;
    }

    @Override
    public Trait getTrait() {
        return trait;
    }

    @Override
    public String getTrait(String name) {
        return null;
    }

    @Override
    public int getAge() {
        return age;
    }


}
