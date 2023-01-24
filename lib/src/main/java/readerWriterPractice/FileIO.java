package readerWriterPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****

<b>Title:</b> FileIO.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 24 2023
@updates:

****/

public class FileIO {
	public static void main(String[] args) {
		
		String[] names = { "Sean", "Tom", "George", "Nick" };
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\home\\seancraig\\eclipse-workspace\\IntroToProgramming\\lib\\output.txt"));
			writer.write("Writing to file.");
			
			for (String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\home\\seancraig\\eclipse-workspace\\IntroToProgramming\\lib\\output.txt"));
			
			String line;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
