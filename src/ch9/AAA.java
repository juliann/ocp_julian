package ch9;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AAA {
public static void main(String[] args) {
	produceAndDeleteSeverealPathsNested();
}
private static void produceAndDeleteSeverealPathsNested() {

	
	Path nestedGroupPath = Paths.get( "C:","Users","julian","git","SimpleTests","SimpleTests","fileTests", "nestedGroupPath/sub1/sub2" );
	
		
			if( ! Files.exists( nestedGroupPath )) {

//				Path relativeNested = Paths.get( "nest");
				produceNestedPaths( nestedGroupPath, 3 );
			}
			deleteNestedPaths( Paths.get( nestedGroupPath.toString() ) );					
}

private static void produceNestedPaths( Path path, int counter ) {		
	
	if( counter == 1) {			
		try {
			Path lastPath = Paths.get( path + FileSystems.getDefault().getSeparator() + counter );
			Files.createDirectories( lastPath );		
		}catch(IOException e) {
			e.printStackTrace();
		}			
	}else {
		produceNestedPaths( Paths.get(  path + FileSystems.getDefault().getSeparator() + counter  ) , --counter  );
	}
	
}

private static void deleteNestedPaths( Path path ) {
//	System.out.println(path.toString());
	// next attempt with walk 
	// Problem: walk() geht von oben nach unten im FileTree,
	// deswegen ist die Reihenfolge genau umgekehrt wie benötigt und wirft DirectoryNotEmptyException s
	// => Stream umdrehen
	
	
	try {
		Files.walk( path )
			.sorted( (p1,p2) -> {
				return p2.compareTo(p1);
			})
			.forEach(System.out::println);
			
//			.forEach( p -> {
//				try {
//					Files.delete(p);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} 
//			);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}

}
