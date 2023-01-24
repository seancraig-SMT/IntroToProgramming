package readerWriterPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/****

<b>Title:</b> FileToReadandWrite.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 24 2023
@updates:

****/

public class FileToReadandWrite {

	String fileName;
	ArrayList<String> arrayLines = new ArrayList<>();
	
	
	public FileToReadandWrite(String text) {
		fileName = text;
	}
	
	public ArrayList<String> readFile() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			String line;
			
			while ((line = reader.readLine()) != null){
				
				arrayLines.add(line);
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return arrayLines;
	}
	
	public void writeFile(ArrayList<String> lines) {
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output_uppercase.txt"));
			for(String line : lines) {
				writer.write(line.toUpperCase() + "\n");
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
