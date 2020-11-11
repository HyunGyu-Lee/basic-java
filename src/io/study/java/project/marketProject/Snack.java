package io.study.java.project.marketProject;

public class Snack {
    private String snackValue;
    private int snackPrice;

    public Snack(String snackValue, int snackPrice){
        this.snackPrice = snackPrice;
        this.snackPrice = snackPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public String getSnackValue() {
        return snackValue;
    }
    public int totalSnackPrice(int num, int snackPrice){
        int totalSnackprice = num * snackPrice;
        return totalSnackprice;
    }
}
