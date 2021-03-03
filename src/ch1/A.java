package ch1;

import java.util.ArrayList;
import java.util.Properties;
import java.util.stream.Collectors;

import ch1.A.AAAAA.AAAA;

public class A {
	Runnable r = new Thread();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((r == null) ? 0 : r.hashCode());
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (r == null) {
			if (other.r != null)
				return false;
		} else if (!r.equals(other.r))
			return false;
		if (x != other.x)
			return false;
		return true;
	}

	static class AAAAA{
	static class AAAA{
		static int a=5;
			
		}
	}

	private int x=10;

private class z{
	
}
	public class B {
		 
		private int x=20;
	
		public class C {
			
			private int x=30;
			
			public void allTheX() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
				System.out.println(AAAA.a);
				
			}
		}
	 }
	 
		public static void main(String[] args) {
		
			A a = new A();
			A.B b1 = new A().new B();
			System.out.println(b1.x);
			
			
			A.B b= a.new B();
			A.B.C c= b.new C();
			c.allTheX();
			System.out.println(null instanceof A);
//			System.out.println(b instanceof ArrayList<E>);
//			System.out.println(b instanceof Collectors);
		}
}

interface aaa{
	
}


