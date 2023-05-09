package const_ructors;

public class Constructor_Class {

	public static void main(String[] args) {
		
		// Creating object using default constructor
        Person person1 = new Person();
        person1.display();

        // Creating object using parameterized constructor
        Person person2 = new Person("John", 25);
        person2.display();

	}

}


