package org.example.Resources;

public class Land implements Resource{

    private int amount;
    public Land(int amount){
        this.amount = amount;
    }
    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public int reduce(int count) {
        this.amount = amount-count;
        return amount;
    }

    public int increase(int count) {
        this.amount = amount+count;
        return amount;
    }

    @Override
    public Boolean RandomEvent() {
        return null;
    }
}
