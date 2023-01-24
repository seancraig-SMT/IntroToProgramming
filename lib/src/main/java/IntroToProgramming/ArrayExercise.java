package IntroToProgramming;

/****

<b>Title:</b> ArrayExercise.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 20 2023
@updates:

****/

public class ArrayExercise {
	
	public static void main(String[] args) {
		
		
		
		
		int[] anArray;
		anArray = new int[10];
		
		for (int number : anArray) {
			int randVal = (int) (Math.random() * 100);
			number = randVal;
			
			System.out.println(number) ;
		}
		

		
		
	}

}
