package io.study.java.examples.object.string.array;

public class Test {
    public static void main(String[] args) {

        byte bytes[] = {104,101,108,108,111};
        String str =  new String(bytes);
        String str1 = new String(bytes,1,4);


        System.out.println(str);
        System.out.println(str.charAt(3));
        System.out.println(str1);


        
        if(str.equals(str1)){
            System.out.println("동일합니다.");
        }else{
            System.out.println("동일하지 않습니다.");
        }



    }
}
