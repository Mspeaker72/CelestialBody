package org.example.Resources;

public interface Resource {

    public int getAmount();

    public int reduce(int count);

    public int increase(int count);

    public Boolean RandomEvent();

}
