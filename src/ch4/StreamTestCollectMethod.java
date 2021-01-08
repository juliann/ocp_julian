package ch4;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestCollectMethod {

	public static void main(String[] args) {
 
 
	//	<R> R 	collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
 
 
		Stream<String> strings = Stream.of("Hertha", "Berta", "Schnick", "Schnack");
 
				// a ist das TreeSet b ist der String  / a gibt es in jedem parallelen Stream
				// c ist ein TreeSet a aus einem Stream und d ist ein TreeSet a aus einem anderenn Stream
TreeSet<String> treeString = strings.collect(  () -> new TreeSet<String>(), ( a,b ) -> a.add(b), ( c,d ) -> c.addAll( d ));
 
 
 
 
		Stream<String> strings2 = Stream.of("Hertha", "Berta", "Schnick", "Schnack");
 
		Map<String, String> mapString = strings2.collect( Collectors.toMap(a -> "key-".concat(a), b -> "value" + b) );
 
		for(Map.Entry<String, String>  me : mapString.entrySet()) {
			System.out.println( me.getKey() + "\t" + me.getValue() );
		}
 
		System.out.print("\n");
		mapString.forEach( (a,b)-> System.out.println(a + "\t" + b) );
 
 
	}}
 
