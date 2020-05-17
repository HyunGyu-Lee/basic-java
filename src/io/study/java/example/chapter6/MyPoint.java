package io.study.java.example.chapter6;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this. x = x;
        this. y = y;
    }

    public void setX(int px){
        this.x = px;
    }

    public void setY(int py){
        this.y = py;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


}
