package ch1;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Season.FALL.ordinal());
		
		for(Season s:Season.values()) {
			System.out.println(s.name() + " " + s.ordinal() );
			s.printV();
			s.print();
		}
		
		System.out.println(2==Season.FALL.ordinal());
		System.out.println(3==Season.FALL.ordinal());
		Season.WINTER.print();
	}
}
