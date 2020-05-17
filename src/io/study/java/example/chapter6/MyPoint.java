package io.study.java.example.chapter6;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){       //초기좌표를 (0.0)으로 한다.
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){       //초기좌표를 저장
        this. x = x;
        this. y = y;
    }

    public void setX(int px){       // x좌표를 저장
        this.x = px;
    }

    public void setY(int py){       //y좌표를
        this.y = py;
    }

    public int getX() {        //x좌표를 취득
        return this.x;
    }

    public int getY() {       //y좌표를 취득
        return this.y;
    }


}
