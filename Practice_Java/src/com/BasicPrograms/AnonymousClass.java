package com.BasicPrograms;

interface A {
	public void show();
}

public class AnonymousClass {

	public static void main(String[] args) {
		A a = new A() {
			public void show() {
				System.out.println("Inside Inner Class");
			}
		};
		a.show();

	}

}
