package io.study.java.examples.printer.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class ClassInfo implements Printable {
	private int no;
	private int count;

	public ClassInfo(int no, int count) {
		this.no = no;
		this.count = count;
	}

	public int getNo() {
		return no;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String makeContent() {
		return String.format("반번호~ %d, 학생 수~ %d", no, count);
	}
}
