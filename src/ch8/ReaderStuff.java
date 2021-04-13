package ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

import org.w3c.dom.DOMImplementationSource;

import com.fasterxml.jackson.databind.ser.std.FileSerializer;

import jdk.jfr.events.FileWriteEvent;

public class ReaderStuff {
	
public static void main(String[] args) {
	String s;
	
	try(FileReader fr = new FileReader("");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("");
			BufferedWriter bw = new BufferedWriter(fw);
			OutputStream os = new FileOutputStream("");
					){
			s=br.readLine();	
			Object o1 = Optional.of(1);
			DoubleFunction df = x -> x+10;
//			Arrays.asList(1.0).stream().forEach(df);
			Object apply = df.apply(10);
			}catch(IOException e) {
				
			}
}
}
enum Coffee{
	   ESPRESSO("Very Strong");//, MOCHA, LATTE; //2  
	public String strength; //3   
	Coffee(String strength) //4  
	{     this.strength = strength; //5
	} 
	}
class Outer { 
	private void Outer() { }
protected class Inner extends Thread  
{    @Override
public synchronized void run() {
//	PrintWriter pw = new 
	ConcurrentMap cm;
	
}
	}
}
