package ch02;

class ExampleClass2 {
	
	static int number = 3;
	double doubleNumber;
	
	void method(Sample1 arg) {
		arg.data++;
		System.out.println("method in : " + arg.data);
	}
	
	static void staticMethod() {
		
	}
}

class Sample1 {
	int data;
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 0;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		instance1.method(sample);
		
		System.out.println(sample.data);
		
	}

}
