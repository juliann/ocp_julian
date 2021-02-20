package ch8;

public class Serial2 {

	class Animal{
	int weight;
	{
		weight=10;
	}
	}
	class Dog extends Animal{
		String name;
		transient int id;
		transient String breed;
	}
}
