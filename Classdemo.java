package com.core;

import java.util.Scanner;

class Student
{
	int rno;
	String sname;
	double per;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No : ");
		rno=sc.nextInt();
		System.out.println("Enter Student Name : ");
		sname=sc.next();
		System.out.println("Enter Percentage : ");
		per=sc.nextDouble();
		
	}

       void putdata()
       {
    	   System.out.println("Roll NO : "+rno);
           System.out.println("Student Name : "+sname);
           System.out.println("Percentage :"+per);
       }



public class Classdemo {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.getData();
		System.out.println("Aftet getdata");
		s1.putdata();
		System.out.println("After putdata");
		
		Student s2=new Student();
		s2.getData();
		System.out.println("Aftet getdata");
		s2.putdata();
		System.out.println("After putdata");
	}
	

	}

}
