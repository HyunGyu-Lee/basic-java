package io.study.java.examples.playGame;

public class PlayEnum {
    private int randomNum;
    public PlayEnum(){

    }

    public enum PlayType{
        ROCK(0), SCISSOR(1), PAPER(2) ;
        private int PlayNum;

        PlayType(int PlayNum){
            this.PlayNum = PlayNum;

        }
    }

    public void setRandomNum(){
        double random = Math.floor(Math.random()*3);
        this.randomNum = (int) random;



    }
}
