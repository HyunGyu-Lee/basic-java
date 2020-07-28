package io.study.java.examples.object.dateClassExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String nowTime = sdf.format(now);
        System.out.println(nowTime);
    }
}
