package io.study.java.examples.object.calenderClassExample;
import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        System.out.println(year+"년");

        int week = cal.get(Calendar.DAY_OF_WEEK);
        String str = null;
        switch(week){
            case Calendar.SUNDAY:
                str = "일요일";
                break;
            case Calendar.MONDAY:
                str = "월요일";
                break;
            case Calendar.TUESDAY:
                str = "화요일";
                break;
            case Calendar.WEDNESDAY:
                str = "수요일";
                break;
            case Calendar.THURSDAY:
                str = "목요일";
                break;
            case Calendar.FRIDAY:
                str = "금요일";
                break;
            case Calendar.SATURDAY:
                str = "토요일";
                break;
        }
        System.out.println(str);

    }
}
