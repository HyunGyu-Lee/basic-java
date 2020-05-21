package io.study.java.example.chapter6.Coffee;

public class CoffeePos {
    private int amePrice;
    private int cafPrice;
    private int sizePrice;
    private String orderString;


    public CoffeePos[] order(String orderString){

        this.amePrice = amePrice;
        this.cafPrice = cafPrice;
        this.sizePrice = sizePrice;
        this.orderString = orderString;

        String[] aa = orderString.split("_");  //aa[0]="커피종류"  aa[1]="사이즈업 여,커피잔수"
        String[] bb = aa[1].split(","); // bb[0]="사이즈업여부" bb[1]="커피잔수"


        if(aa[0].equals("A")){
            aa[0] = "아메리카노";
        } else if(aa[0].equals("C")){
            aa[0] = "카페라떼";
        }
        return new CoffeePos[Integer.parseInt(bb[1])];










    }

}
