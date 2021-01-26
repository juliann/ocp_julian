package resources;

import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle {
	
@Override
protected Object[][] getContents() {
	return new Object[][] {
		{"hello", "Hallo"},
		{"open3", "Zoo ist aaaaaaaaaaaaaaaaauuuuuuuuuufffffffff"}
	};
}
}
