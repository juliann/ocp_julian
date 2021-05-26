package Testchecks;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch4.Ding;

public class Mapcheck {

	public static void main(String[] args) {

		 Map<Ding, Object> collect = Stream.of(Ding.makeDing()).collect(Collectors.toConcurrentMap(  c->c, (Ding d) -> null));
		System.out.println(collect);
	}
}
