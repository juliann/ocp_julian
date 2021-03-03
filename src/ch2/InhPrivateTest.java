package ch2;

import java.nio.file.attribute.DosFileAttributes;

public class InhPrivateTest {

	private int age;
	private String species;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}

class B extends InhPrivateTest{
	public static void go() {
		B b = new B();
		b.doSth();
		b.setAge(3);
		b.setSpecies("potatoe");
		System.out.println(b.getAge());
		System.out.println(b.getSpecies());
		b.doSth();
	}
	 void doSth() {
		System.out.println("my age soon will be: " + (getAge()+1));
		System.out.println("i wish i wasn't a " + getSpecies());
	}
}
class C extends B{
	public static void main(String[] args) {
		B.go();
		
		C c = new C();
		c.doSth2();
		c.setAge(5);
		c.setSpecies("tomatoe");
		System.out.println(c.getAge());
		System.out.println(c.getSpecies());
		c.doSth2();
	}
	 void doSth2() {
		System.out.println("my age soon will be: " + (getAge()+1));
		System.out.println("i wish i wasn't a " + getSpecies());
	}
		
		
	}
