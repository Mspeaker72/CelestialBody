package org.example.Resources;

public class Food implements Resource{
    private int amount;
    public Food(int amount){
        this.amount = amount;
    }
    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public int reduce() {
        return 0;
    }

    @Override
    public int increase() {
        return 0;
    }

    @Override
    public Boolean RandomEvent() {
        return null;
    }
}
