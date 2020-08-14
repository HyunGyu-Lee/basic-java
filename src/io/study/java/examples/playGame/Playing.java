package io.study.java.examples.playGame;

public class Playing {
    private int num;

    enum PlayGo{
        rock, scissor, paper
    }


    public String setNum(){
        PlayGo playGo = PlayGo.rock;

        double random = Math.floor(Math.random()*3);
        this.num = (int) random;

        switch(playGo){
            case rock :
            case scissor:
            case paper:
        }





        return null;
    }

    public void playGame(){


    }
}
