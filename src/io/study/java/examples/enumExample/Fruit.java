package io.study.java.examples.enumExample;

enum Fruit {
    Banana("yellow"), Peach("pink"), Apple("red");       // public static final Fruit Banana; 와 같은 의미

    public String color;

    Fruit(String color){
        this.color = color;
        System.out.println(this.color);
    }

    public String getColor(){
        return this.color;
    }
}
