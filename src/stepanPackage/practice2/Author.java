//
// Practice ¹–1 Berkunov Stepan INBO-02-20
//

package stepanPackage.practice2;

import java.lang.*;

public class Author {
	String name;
	String email;
	char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return this.gender;
	}
	
	@Override
	public String toString() {
		return this.getName() + " (" + this.getGender() + ") " + "at " + this.getEmail();
	}
}
