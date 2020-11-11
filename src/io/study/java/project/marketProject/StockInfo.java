package io.study.java.project.marketProject;

public class StockInfo {
    private int stock;
    private int price;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printStock(String name){
        System.out.println(String.format("%s 의 재고는 : %s  개당가격  : %s 원", name, stock, price));
    }

    public void printPrice(int n, int m){

    }
}
