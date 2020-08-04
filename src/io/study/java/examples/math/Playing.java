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
        System.out.println(play);

        return play;
    }

    public void playGame(String str){

        switch(str){
            case "묵" :
                if(play.equals("묵")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(play.equals("찌")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(play.equals("빠")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }
            case "찌" :
                if(play.equals("묵")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(play.equals("찌")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(play.equals("빠")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }
            case "빠" :
                if(play.equals("묵")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(play.equals("찌")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(play.equals("빠")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }
        }
    }
}
