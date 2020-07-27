package io.study.java.examples.object.string.array;

public class Test {
    public static void main(String[] args) {

        byte bytes[] = {104,101,108,108,111};
        String str2 = "안녕하세요";

        String str =  new String(bytes);
        String str1 = new String(bytes,1,4);

        byte[] bite1 = str2.getBytes();
        String str3 = new String(bite1);

        System.out.println(bite1.length);
        System.out.println(str3);
        
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
