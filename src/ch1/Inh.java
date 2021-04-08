package ch1;

import java.nio.file.Files;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.mysql.cj.protocol.Resultset;

public class Inh {
	static int j= 5;
	private void test() {
		System.out.println("Inh test");
	}
	
	public static void main(String[] args) {
		Inh i = new Inh();
		i.test();
		T t = new T();
		t.doS();
		T.sst();
	
		}
	static void stest() {
		
	}
	static void sst() {
		System.out.println(j);
		
	}
	protected void sup() {}
}
class T extends Inh{
	private static class TH{}
	
	static int j = 10;
	private void test() {
		
		System.out.println("T test");
	}
	public void doS(){
		test();
	}
	static void stest() {
		
	}
	static void sst() {
		System.out.println(j);
	}
	@Override
	public final void sup() {
		// TODO Auto-generated method stub
		super.sup();
	}
}
