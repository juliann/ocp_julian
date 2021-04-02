package ch1;

public class Inh {
	private void test() {
		System.out.println("Inh test");
	}
	
	public static void main(String[] args) {
		Inh i = new Inh();
		i.test();
		T t = new T();
		t.doS();
	}
	static void stest() {
		
	}
}
class T extends Inh{
	private void test() {
		System.out.println("T test");
	}
	public void doS(){
		test();
	}
	static void stest() {
		
	}
}
