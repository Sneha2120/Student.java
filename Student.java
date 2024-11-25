package com.anpc8323.day3;
//Access non-static variables inside same class
public class Student {

	int age = 29;
	String name = "ABCD";
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.age);
		System.out.println(s.name);	
		}

}
