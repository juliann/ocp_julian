package ch1;

public class MemberInner {

	String name="horst";
	
	class Inner{
		public void go1(){
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		MemberInner m = new MemberInner();
		Inner i = m.new Inner();
		i.go1();
		
	}
}



