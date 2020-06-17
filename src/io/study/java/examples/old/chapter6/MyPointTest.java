package io.study.java.examples.old.chapter6;

public class MyPointTest {

    private int x;
    private int y;

    public MyPointTest() {
        int x, y = 0;
    }

    public MyPointTest(int px, int py) {
        this.x = px;
        this.y = py;
    }

    public void setX(int px) {
        this.x = px;
    }

    public void setY(int py) {
        this.y = py;
    }

    public int getX(){
        return this.x;

    }

    public int getY(){
        return this.y;

    }

}
