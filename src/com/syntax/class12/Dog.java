package com.syntax.class12;

public class Dog {
	      
	      //attributes, fields, properties
	
	      String name;
	      String color;
	      String breed;
	      char gender;
	      int age;
	      double weight;
	      
	      //behaviors, functions and methods
	
	      void barks() {
	    	  System.out.println("Dog is barking...");
	      }
	
	      void eat() {
	    	  System.out.println("Dog is eating");
	      }
	
	      void sleep() {
	    	  System.out.println("Dog is sleeping");
	      }
	

	public static void main(String[] args) {
		// creating an object scooby from class Dog
		
		Dog scooby=new Dog();
		// Dog is a class
		//scooby is an object
		//= is assignment operator
		//new is a keyword that we use to create the object of a class
		//Dog() we are calling the constructor of the class
		//Scanner scan=new Scanner(system.in);
		
		scooby.barks();
		scooby.eat();
		scooby.sleep();
		
		
		

	}

}
