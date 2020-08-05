package io.study.java.examples.math;

public class Playing {
    private int num;
    String play;
    int newNum;


    public String setNum(){

        double random = Math.floor(Math.random()*3);
        this.num = (int) random;

        if(this.num==0){
            this.play = "묵";
        }else if(this.num==1){
            this.play = "찌";
        }else if(this.num==2){
            this.play = "빠";
        }
        System.out.println(this.play);

        return play;
    }

    public void playGame(String str){

        if(str.equals("묵")){
            newNum = 0;
        }else if(str.equals("찌")){
            newNum = 1;
        }else if(str.equals("빠")){
            newNum = 2;
        }

        if(newNum-this.num==2||newNum-this.num==-1){
            System.out.println("승리");
        }else if(newNum-this.num==1||newNum-this.num==-2){
            System.out.println("패배");
        }else if(newNum==this.num){
            System.out.println("비김");
        }


    }
}
