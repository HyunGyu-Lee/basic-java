package io.study.java.examples.math;

import java.util.Scanner;

public class PlayingMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("묵찌빠 중 하나를 내세요.");
        String playGo = sc.nextLine();


        for(int i=0;i<10;i++){
            if(playGo.equals("묵")||playGo.equals("찌")||playGo.equals("빠")){
                break;
            }else{
                System.out.println("다시 입력하세요.");
                playGo=sc.nextLine();
                continue;
            }
        }


        Playing playing = new Playing();
        playing.setNum();
        System.out.println(playing.getPlay());


        switch(playGo){
            case "묵" :
                if(playing.getPlay().equals("묵")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(playing.getPlay().equals("찌")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(playing.getPlay().equals("빠")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }
            case "찌" :
                if(playing.getPlay().equals("묵")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(playing.getPlay().equals("찌")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }else if(playing.getPlay().equals("빠")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }
            case "빠" :
                if(playing.getPlay().equals("묵")){
                    System.out.println("이겼습니다. 축하해요");
                    break;
                }else if(playing.getPlay().equals("찌")){
                    System.out.println("졌습니다...ㅠㅡㅠ");
                    break;
                }else if(playing.getPlay().equals("빠")){
                    System.out.println("비겼습니다. 다시시작하세요.");
                    break;
                }
        }
    }
}
