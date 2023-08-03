package org.example.Resources;

public class Materials implements Resource {
    private int amount;

    public Materials(int amount){
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

    public void setAmount(int amount) {
        this.amount = amount;
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
