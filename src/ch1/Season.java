package ch1;

public enum Season {
	WINTER("low")
	, SPRING("medium") {
		
		public void print() {
			System.out.println("spring");
			
		}
	}, SOMMER("high"), FALL("medium"); 
		
		public void print() {
			System.out.println("standard");
			
		}
	
	
	String expectedVisitiors;
	
	 Season(String string) {
		this.expectedVisitiors = string;
	}

	public void printV() {
		System.out.println(expectedVisitiors);
	}
	
	//public abstract void print();
}
