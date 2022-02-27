package demo;

import java.util.ArrayList;

public class Documentation {
	public static void main(String[] args) {

//	Java is a popular programming language.
//	Java is used to develop mobile apps, web apps, desktop apps, games and much more.

//	String - stores text, such as "Hello". String values are surrounded by double quotes
//	int - stores integers (whole numbers), without decimals, such as 123 or -123
//	float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//	char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//	boolean - stores values with two states: true or false

//	variable called name of type String and assign it the value "Roshan":	
		String name = "Roshan";
//	System.out.println are Use for printing or geting result in  visual form in java
		System.out.println(name);

//	Create a variable called myNum of type int and assign it the value 15:
		int myNum = 15;
		System.out.println(myNum);
//	diffrent data Types with values
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;

//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
//
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte
//		

//		Java divides the operators into the following groups:
//
//			Arithmetic operators
//			Assignment operators
//			Comparison operators
//			Logical operators
//			Bitwise operators	
//		
//		Arithmetic operators
//		+	Addition	    Adds together two values	        x + y	
//		-	Subtraction    	Subtracts one value from another	x - y	
//		*	Multiplication	Multiplies two values	            x * y	
//		/	Division	    Divides one value by another	    x / y	
//		%	Modulus	        Returns the division remainder	    x % y	
//		++	Increment	Increases the value of a variable by 1	  ++x	
//		--	Decrement	Decreases the value of a variable by 1	  --x	

//		Logical Operators
//		&& 	Logical and	Returns true if both statements are true
//		|| 	Logical or	Returns true if one of the statements is true
//		!	Logical not	Reverse the result, returns false if the result is true

//		Java Strings	
//		A String variable contains a collection of characters surrounded by double quotes:
		String str = "Hello";

//			length() method:
		System.out.println("The length of the txt string is: " + str.length());

		// Outputs "HELLO "
		System.out.println(str.toUpperCase());

		// Outputs "hello
		System.out.println(str.toLowerCase());

		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7

		

//		concat() method to concatenate two strings:
//			Example
			String firstName = "Roshan ";
			String lastName = "Kharode";
			System.out.println(firstName.concat(lastName)); // output is RoshanKharode
		
		
		
			int x = 10;
			int y = 20;
			int z = x + y;      // z will be 30 (an integer/number)
		
		
		
			String a = "10";
			String b = "20";
			String c = a + b;   // z will be 1020 (a String)
		
		
//			Java Booleans
//			Very often, in programming, you will need a data type that can only have one of two values, like:
//			YES / NO
//			TRUE / FALSE
			
//			Java Conditions and If Statements
//			Java supports the usual logical conditions from mathematics:
//			Less than: a < b
//			Less than or equal to: a <= b
//			Greater than: a > b
//			Greater than or equal to: a >= b
//			Equal to a == b
//			Not Equal to: a != b
		
			
			
			
//			Use if to specify a block of code to be executed, if a specified condition is true
//			Use else to specify a block of code to be executed, if the same condition is false
//			Use else if to specify a new condition to test, if the first condition is false
//			Use switch to specify many alternative blocks of code to be executed
			
			
//			The switch expression is evaluated once.
//			The value of the expression is compared with the values of each case.
//			If there is a match, the associated block of code is executed.
//			The break and default keywords are optional, and will be described later in this chapter	
			
			
//			Example
			int day = 4;
			switch (day) {
			  case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
			}
			// Outputs is Thursday
			
			
//			Loops
//			Java While Loop
//			The while loop loops through a block of code as long as a specified condition is true:
	
			
			
			for (statement 1; statement 2; statement 3) {
				}
			
//			java For Loop
//			When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
//			Statement 1 is executed (one time) before the execution of the code block.
//
//			Statement 2 defines the condition for executing the code block.
//
//			Statement 3 is executed (every time) after the code block has been executed.
//
//			The example below will print the numbers 0 to 4:
	
	
	
//			For-Each Loop
//			There is also a "for-each" loop, which is used exclusively to loop through elements in an array
	
			for (type variableName : arrayName) {
				}
	
	
	
	
//			Java Arrays
//			Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//
//			To declare an array, define the variable type with square brackets
	
	
	
			int[] n = {10, 20, 30, 40};
			System.out.println(n.length); //output is 3
	
	
	
//	Access Moddifiers
//			public	The code is accessible for all classes	
//			private	The code is only accessible within the declared class
//			protected	The code is accessible in the same package and subclasse
	
	
//			Java Constructors
//			A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
			
			
//			Encapsulation
//			The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//
//			declare class variables/attributes as private
//			provide public get and set methods to access and update the value of a private variable
//	
//			Example
			public class Person {
			  private String name; // private = restricted access

			  // Getter
			  public String getName() {
			    return name;
			  }

			  // Setter
			  public void setName(String newName) {
			    this.name = newName;
			  }
			}
	
//			Java Polymorphism
//			Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
	
			class zoo {
				  public void animalSound() {
				    System.out.println("The animal makes a sound");
				  }
				}

				class cat extends zoo {
				  public void animalSound() {
				    System.out.println("The cat says: meo meow");
				  }
				}

				class Dog extends zoo {
				  public void animalSound() {
				    System.out.println("The dog says: bow wow");
				  }
				}
	
	
//				Abstract Classes and Methods
//				Data abstraction is the process of hiding certain details and showing only essential information to the user.
	
	
//				Java ArrayList
//				The ArrayList class is a resizable array, which can be found in the java.util package.
	
	
				import java.util.ArrayList; // import the ArrayList class

				ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
	
	
//				Java HashMap
//				object  will store String keys and String values:
	
//				java Files
//				File handling is an important part of any application.
//
//				Java has several methods for creating, reading, updating, and deleting files.
//				Java File Handling
//				The File class from the java.io package, allows us to work with files.
//
//				To use the File class, create an object of the class, and specify the filename
	                        public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
	}
}
