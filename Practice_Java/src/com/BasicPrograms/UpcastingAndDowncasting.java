package com.BasicPrograms;

class Machine {

	public void start() {
		System.out.println("Machine has started!!!");
	}
}

class Laptop extends Machine {

	@Override
	public void start() {

		System.out.println("Laptop has started!!!");
	}

	public void stop() {
		System.out.println("Laptop has stopped!!!");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {

		Machine machine = new Machine();
		machine.start();// This calls the start method of Machine class.
		Laptop laptop = new Laptop();
		laptop.start();// This calls the start method of Laptop class because we have overridden this
						// method in Laptop class.
		laptop.stop();// This calls the stop method of Laptop class.

		/*
		 * Upcasting : For upcasting we assign the child class reference/instance to
		 * parent class reference .
		 */
		Machine machine1 = laptop;// Here we have assigned child class reference to parent class reference .
		// This is similar to Machine machine1= new Laptop().
		// machine1 can call all the methods of Machine class but only overridden
		// methods of child class.
		// Below method calls explains the same .
		machine1.start();// Calls child class start method.
		// machine1.stop();//this will give compilation error as machine1 does not have
		// visibility of all the methods of child class
		// but only those methods which are overridden in child class.

		/*
		 * Down casting : we assign reference of parent class(machine2) which points to
		 * child class object(new Laptop()) to the reference of child class (laptop1)
		 * using explicit cast.
		 */
		Machine machine2 = new Laptop();// machine2 is reference of object of Laptop class.
		machine2.start();// calls Laptop class's start method.
		// machine2.stop();will give compile time error
		Laptop laptop1 = (Laptop) machine2;// Here we have casted machine2 variable/ref to Laptop type.
		// hence laptop1 is of type Laptop and can call all the methods from
		// Laptop(child) and Machine(parent) classes.
		laptop1.start();// calls Laptop class's start method.
		laptop1.stop();// calls laptop class's stop method.
	}
}
