package io.study.java.examples.math;

public class Playing {
    private int num;
    String play;


    public String setNum(){

        double random = Math.floor(Math.random()*3);
        num = (int) random;

        if(num==0){
            play = "묵";
        }else if(num==1){
            play = "찌";
        }else if(num==2){
            play = "빠";
        }

        return play;
    }

    public String getPlay() {
        return play;
    }
}
