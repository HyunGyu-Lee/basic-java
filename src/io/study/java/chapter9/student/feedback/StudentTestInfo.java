package io.study.java.chapter9.student.feedback;

public class StudentTestInfo {

    public class StudentTestInfo{
        private String name;
        private int age;
        private int korean;
        private int math;
        private int english;


        public StudentTestInfo(String name, int age, int korean, int math, int english){

            this.name = name;
            this.age=age;
            this.korean=korean;
            this.math=math;
            this.english=english;
        }

        public String getName(){return name;}

        public int getAge(){return age;}

        public int getKorean(){return korean;}

        public int getMath(){return math;}

        public int getEnglish(){return english;}

        public int totalRecord(){return korean+math+english;}

        public int avgRecord(){return (korean+math+english)/3 ;}







    }
}
