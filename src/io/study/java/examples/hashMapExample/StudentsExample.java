package io.study.java.examples.hashMapExample;
import java.util.*;

public class StudentsExample {
    public static void main(String[] args) {

        List<Students> array = new ArrayList();
        Map<Integer, List<Students>> map = new HashMap();

        Scanner sc = new Scanner(System.in);


        int num = 0;

        while (num <= 3) {
            if (num == 3) {
                System.out.println("종료");
                break;
            }
            System.out.println("============");
            System.out.println("1. 학생 입력");
            System.out.println("2. 기록부 조회");
            System.out.println("3. 종료");
            System.out.println("============");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("학생 번호를 입력하시오");
                    int number = sc.nextInt();
                    System.out.println("이름을 입력하시오");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("나이를 입력하시오");
                    int age = sc.nextInt();

                    Students st = new Students(name, age);
                    array.add(st);
                    map.put(number, array);
                    break;
                case 2:
                    System.out.println("학생 조회");
                    if (map.size() == 0) {
                        System.out.println("등록 데이터 없습니다.");
                        break;
                    } else {
                        int i = 0;
                            for (Map.Entry entry : map.entrySet()) {

                                if(map.size()!=0){
                                    Students students = array.get(i);
                                    System.out.println(String.format("[학생번호]:%s,[학생이름]:%s,[학생나이]:%s",entry.getKey(),students.getName(),students.getAge()));
                                    i ++;
                                }

                            }
                        }
                    }
            }
        }
    }
