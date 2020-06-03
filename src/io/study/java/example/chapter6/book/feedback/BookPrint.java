package io.study.java.example.chapter6.book.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class BookPrint {
	private String printType;

	public BookPrint(String printType) {

		this.printType = printType;
	}

	// 전달받은 책 객체의 내용을 출력하는 기능(= 메소드)
	// 책 출력기 클래스에서 책 클래스 멤버변수를 선언하지 않은 이유는 선언할 필요가 없기 때문
		// 아래 코드만 봐도, 전달받은 책 객체 가지고 할 것 다함
		// 굳이 저 위에 생성자처럼 출력타입 멤버변수로 저장해둘 필요 없음
	// 클래스, 객체, 멤버변수와 메소드를 다시 얘기하자면
		// 클래스는 어떠한 사물, 정보 등을 표현한 것
			// BookPrint - 책 출력기를 표현한 클래스
			// Book - 책을 표현한 클래스
		// 객체는 그 클래스를 통해 실체화된 것
			// new를 통해 객체를 생성(실체화)함
		// 멤버변수는 그 클래스가 표현하는 대상의 "속성"을 정의하기 위함
			// Book 클래스의 경우 책 제목, 저자, 내용 등이 책의 속성이 됨
			// BookPrint 클래스의 경우 출력 방식을 결정해주는 출력 타입이 속성이됨
		// 메소드를 선언하는건 그 클래스를 통해 만든 객체가 수행할 수 있는 "기능"을 정의함
			// 기본적인 객체의 정보를 반환하는 애들 (get~~)
			// 이외에 추가 기능
				// BookPrint에 Book을 출력하는 "print" 메소드를 만든게 그 예시임
			// 메소드에서는 전달받은 값을 쓰던 자신의 속성을 쓰던 상관이 없음
				// 아래 예시에선, 자신의 속성(printType)을 쓰고, 전달 받은 값(book 객체)를 씀
	public void print(Book book) {
		if(this.printType.equals("K")){
			System.out.println("입력하신 내용을 [한글] 로 출력합니다.");
			System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
			System.out.println(String.format("%s",book.getBookKr()));
		}else if(this.printType.equals("E")){
			System.out.println("입력하신 내용을 [영어] 로 출력합니다.");
			System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
			System.out.println(String.format("%s",book.getBookEn()));
		}
	}
}
