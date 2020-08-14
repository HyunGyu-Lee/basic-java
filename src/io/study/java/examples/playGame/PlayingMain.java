package io.study.java.examples.playGame;

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
        playing.playGame();

    }
}
