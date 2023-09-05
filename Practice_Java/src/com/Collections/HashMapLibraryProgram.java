package com.Collections;

import java.util.HashMap;
import java.util.Map;

class Book1
{
int id;
String name,author,publisher;
int quantity;
public Book1(int id,String name , String author, String publisher,int quantity)
{
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
}
public class HashMapLibraryProgram {

	public static void main(String[] args) {
		Map <Integer,Book1> bk = new HashMap<>();
		Book1 b1 = new Book1(101,"LEGEND","Harry","ONE String Communications",10);
		Book1 b2 = new Book1(102,"UNIVERSE EXISTS","MICHAEL","ONE String Communications",10);
		Book1 b3 = new Book1(103,"BIG BANG","BROOK","ONE String Communications",15);
		Book1 b4 = new Book1(104,"THE MYTH","STEINFELD","ONE String Communications",80);
		Book1 b5 = new Book1(105,"THOUGHT PROCESS","LISA","ONE String Communications",20);
		bk.put(1, b1);
		bk.put(2, b2);
		bk.put(3, b3);
		bk.put(4, b4);
		bk.put(5, b5);
	
		for(Map.Entry<Integer, Book1> entry : bk.entrySet()) 
		{
			int key = entry.getKey();
			Book1 b = entry.getValue();
			System.out.println(key+" Details:");  
	        System.out.println(b.id+" | "+b.name+" | "+b.author+" | "+b.publisher+" | "+b.quantity);  
		}
		


	}

}
