package Testchecks;

import java.time.LocalDate;
import java.util.Optional;

import ch4.Ding;

public class PDFCheck {
public static void main(String[] args) {
	Optional<String> on = Optional.ofNullable(null);
	Ding s = Ding.makeDing();
	Optional<Ding> d = Optional.of(s);
	
	Optional<LocalDate> ld = d.flatMap(a -> a.getDates().stream().filter(b -> b.getYear()==1999).findFirst());
	
	
}
}
