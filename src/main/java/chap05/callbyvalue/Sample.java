package chap05.callbyvalue;

class Updater {
	void update(int count) {
		count++;
	}
}

class Counter {
	int count = 0; // 객체 변수
}

public class Sample {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("before count = " + counter.count);
		Updater updater = new Updater();
		updater.update(counter.count);
		System.out.println("after count = " + counter.count);
	}
}
