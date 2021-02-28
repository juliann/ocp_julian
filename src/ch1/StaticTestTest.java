package ch1;



public class StaticTestTest {

	public static void main(String[] args) {
		String b = StaticTest.InnerStatic.TESTSTRING;
		StaticTest.InnerStatic is = new StaticTest.InnerStatic();
		System.out.println(is.a);
		
	}
	
}
