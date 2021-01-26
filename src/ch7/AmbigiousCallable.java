package ch7;

import java.io.IOError;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbigiousCallable {
	static void useCallable(Callable<Integer> callMe) {};
	static void useSupplier(Supplier<Integer> giveMe) {};
	
	static void use(Callable<Integer> callMe) {};
	static void use(Supplier<Integer> callMe) {};

	public static void main(String[] args) {
		useCallable(() -> {throw new IOException();});
		
	//Unhandled exception type IOException
	//	useSupplier(() -> {throw new IOException();});
		
	//The method use(Callable<Integer>) is ambiguous for the type AmbigiousCallable
	//	use(() -> {throw new IOException();}); 
		
		use((Callable<Integer>)() -> {throw new IOException();}); 
		
	}
}
