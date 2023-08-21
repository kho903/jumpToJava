package chap05.oop._2;

class Calculator {
	int result = 0;

	int add(int num) {
		result += num;
		return result;
	}

	int sub(int num) {
		result -= num;
		return result;
	}
}

/**
 * Calculator 클래스로 만든 별개의 계산기 cal1, cal2 (이것이 객체)가 각각의 역할을 수행.
 * 계산기 수나 기능이 늘어나더라도 문제 없음.
 */

public class Sample {
	public static void main(String[] args) {
		Calculator cal1 = new Calculator(); // 계산기1 객체를 생성함.
		Calculator cal2 = new Calculator(); // 계산기2 객체를 생성함.

		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));

		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	}
}