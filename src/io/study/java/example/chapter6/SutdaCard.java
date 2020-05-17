package io.study.java.example.chapter6;

public class SutdaCard {

    private int num;
    private boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    public String info() {
//        if (isKwang == false) {
//            return num + "";
//        } else {
//            return num + "K";
//        }
        return isKwang == true ? num + "K" : num + "";
    }
}