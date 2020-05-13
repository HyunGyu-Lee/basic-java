package io.study.java.chapter9.student.feedback;

/***
 * 1. 멤버변수에 접근제한자는 private로 지정
 * 2. 변수 네이밍 변경
 * 3. 메소드명은 시작이 소문자 (네이밍 관련해서 카멜케이스 표기법 공부하기)
 */
public class StudentInfo {
	private String name;
	private int age;
	private int koreanScore;
	private int mathScore;
	private int englishScore;

	// 객체 초기화를 생성자로 함
	public StudentInfo(String name, int age, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.age = age;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getScoreTotal() {
		return koreanScore + mathScore + englishScore;
	}

	public double getScoreAverage() {
		return getScoreTotal() / 3;
	}
}
