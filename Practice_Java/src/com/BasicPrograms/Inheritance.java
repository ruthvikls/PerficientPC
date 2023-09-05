package com.BasicPrograms;

 class Car{
	 public void start() {
		 System.out.println("Inside car class of start method");
	 }
	 public void ignition() {
		 System.out.println("Inside car class of ignition method");
	 }
	 }
 class BMW extends Car{
	 public void ignition() {
		 System.out.println("Inside BMW newIgnition");
	 }
	 public void ABS(){
		 System.out.println("ABS System");
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
		Car c = new BMW();
		c.start();
		c.ignition();
		
		BMW b = new BMW();
		b.ignition();
		b.ABS();
		
		

	}

}
