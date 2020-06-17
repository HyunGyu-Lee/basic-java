package io.study.java.chapters.chapter9.student;

public class StudentInfo {
	
	String name;
	int age, korean, math, english;
	
	public StudentInfo(){
		
		System.out.println("학생 정보를 출력합니다.");
		
	}
	
	public void SetStudent(String name, int age, int korean, int math, int english) {
		this.name = name;
		this.age = age;		
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	public void StudentName() {
		
		System.out.println("이름 : "+age);
				
	}
	
	public void StudentRecord() {

		
		System.out.println("국어 점수는"+korean+"입니다.");
		System.out.println("수학 점수는"+math+"입니다.");
		System.out.println("영어 점수는"+english+"입니다.");
	}
	
	public void Studentmultiple() {
		
		System.out.println("점수 총합 : "+(korean+math+english));
		
	}
	
	public void StudentAvg() {
		System.out.println("점수 평균 : " +((korean+math+english)/2));
	}
	
	

}
