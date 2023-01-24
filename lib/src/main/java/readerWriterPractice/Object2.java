package readerWriterPractice;

import java.io.File;
import java.util.ArrayList;

/****

<b>Title:</b> Object2.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 24 2023
@updates:

****/

public class Object2 {

	static final FileToReadandWrite NEW_FILE = new FileToReadandWrite("input.txt");
	
	public static void main(String[] args) {
		
		uppercaseFile();
	
	}
	
	public static void uppercaseFile() {
		
		ArrayList<String> lines = NEW_FILE.readFile();
		NEW_FILE.writeFile(lines);
	}
}
