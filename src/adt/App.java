package adt;

public class App {

	public static void main(String[] args) {
		Counter myCounter = new Counter("MyCounter");
		myCounter.increment();
		myCounter.increment();
		System.out.println(myCounter.toString());
		System.out.println(myCounter.getCurrentValue());
	}

}
