/*
Example of accessor and mutator method
Student.java
*/

class Student {
    public int roll;
    public String name;

    public int getRoll() // accessor method
    {
        return roll;
    }

    public void setRoll(int roll) // mutator method
    {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }
}
public class GettersAndSetters
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRoll(69);
        obj.setName("Adarsh");
        System.out.println(obj.getName()+" Your new Roll Number is : "+obj.getRoll());
        obj.display();
    }
}

// Java Program to Illustrate Getter and Setter

// Importing input output classes
/*
import java.io.*;

// Class 1
// Helper class
class GetSet {

	// Member variable of this class
	private String name;

	// Method 1 - Getter
	public String getName() { return name; }

	// Method 2 - Setter
	public void setName(String N)
	{

		// This keyword refers to current instance itself
		this.name = N;
	}
}

// Class 2
// Main class
class GettersAndSetters {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of class 1 in main() method
		GetSet obj = new GetSet();

		// Setting the name by calling setter method
		obj.setName("Coding Journey");
		// Getting the name by calling geter method
		System.out.println(obj.getName());
	}
}
*/
