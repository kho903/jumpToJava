package chap05.oop._1;

class Calculator1 {
	static int result = 0;

	static int add(int num) {
		result += num;
		return result;
	}
}

class Calculator2 {
	static int result = 0;

	static int add(int num) {
		result += num;
		return result;
	}
}

/**
 * Sample 클래스에서 2대의 계산기가 필요한 상황이면 각 계산기는 각각의 결과값을 유지해야 하기 때문에
 * 똑같은 일을 하는 Calculator1과 Calculator2 클래스를 만듦. 두 클래스는 아무 영향을 끼치지 않음.
 * 하지만 계산기가 여러 개 더 필요해지면, 클래스를 추가해야 하는 불편함 발생. (+기능 추가 불편함)
 */

public class Sample {
	public static void main(String[] args) {
		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));


		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));
	}
}