package io.study.java.examples.enumExample;

public class FruitCompanyExample {
    public static void main(String[] args) {
        Fruit type = Fruit.Apple;
        Company type1 = Company.Apple;

        switch (type){
            case Apple :
                System.out.println("사과입니다."+Fruit.Apple.getColor());
                break;
            case Banana :
                System.out.println("바나나입니다."+Fruit.Banana.getColor());
                break;
            case Peach:
                System.out.println("복숭아입니다."+Fruit.Peach.getColor());
                break;
        }

        for(Fruit f : Fruit.values()){
            System.out.println(f +" 색깔은 : "+ f.getColor());
        }
    }
}
