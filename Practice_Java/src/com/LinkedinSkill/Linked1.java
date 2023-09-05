package com.LinkedinSkill;


interface Interface1 {
    static void print() {
        System.out.print("Hello");
    }
}

interface Interface2 {
    static void print() {
        System.out.print("World!");
    }
}
public class Linked1 {
public static void main(String[] args) {
	Interface1.print();
	Interface2.print();
}
}
