package ch1;

public class LocalInner {

	int length = 5;
	
	void calc() {
		
		int w=20;
		
		class Inner{
			
			void multiply() {
				System.out.println(w*length);
			}
		}
		Inner i = new Inner();
		i.multiply();
	}
	public static void main(String[] args) {
		LocalInner l = new LocalInner();
		l.calc();
	}
}
