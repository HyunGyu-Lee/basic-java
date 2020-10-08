package io.study.java.examples.printer.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class StudentInfo implements Printable {
	private String name;
	private int grade;

	public StudentInfo(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String makeContent() {
		StringBuilder sb = new StringBuilder();
		sb.append("================").append("\r\n");
		sb.append("학생정보").append("\r\n");
		sb.append("이름: ").append(getName()).append("\r\n");
		sb.append("학급: ").append(getGrade()).append("\r\n");
		sb.append("================");
		return sb.toString();
	}
}
