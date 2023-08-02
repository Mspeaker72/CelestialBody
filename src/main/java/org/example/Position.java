package org.example;

public class Position {

    public Position(int x,int y){
        this.x = x;
        this.y = y;

    }
    //pie
    private int y;
    private int x;


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void decrementY(){
        this.y--;
    }

    public void decrementX(){
        this.x--;
    }

    public void incrementY(){
        this.y++;
    }

    public void incrementX(){
        this.x++;
    }
}
