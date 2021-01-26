package ch6;

public class CloseStuff {
public static void main(String[] args) {
	try(SchliessMich m1 = new SchliessMich();){
		System.out.println("hi");
	}catch(RuntimeException e){
		System.out.println("RuntimeException");
		e.printStackTrace();
	}
}
}

class SchliessMich implements AutoCloseable{
	
	public SchliessMich() {
		System.out.println("constructor");
	}
	public void close() throws RuntimeException{	// best practice: hier eine unchecked Exception statt einer Exception
		System.out.println("I am Closing");			// damit man die Exception nicht durchreichen muss (handle/declare)
		throw new RuntimeException();
	
	}
	
}