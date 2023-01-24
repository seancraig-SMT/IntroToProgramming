package IntroToProgramming;

/****

<b>Title:</b> Person.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 22 2023
@updates:

****/

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	
	
	public Person(Integer id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return this.id + ": " + firstName + " " + lastName;
	}

}
