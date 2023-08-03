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

    public int reduce(int count) {
        this.amount = amount-count;
        return amount;
    }

    @Override
    public int increase(int count) {
        this.amount = amount+count;
        return amount;
    }


    @Override
    public Boolean RandomEvent() {
        return null;
    }
}
