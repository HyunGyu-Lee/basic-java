package io.study.java.examples.math;

public class Playing {
    private int num;
    String play;


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

        switch(str){
            case "묵" :
                if(this.play.equals("묵")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(this.play.equals("찌")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(this.play.equals("빠")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }
            case "찌" :
                if(this.play.equals("묵")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(this.play.equals("찌")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(this.play.equals("빠")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }
            case "빠" :
                if(this.play.equals("묵")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(this.play.equals("찌")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(this.play.equals("빠")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }
        }
    }
}
