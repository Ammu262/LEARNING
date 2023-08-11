package ControlConstruct;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println(" enter the number");
	int marks=scan.nextInt();
	System.out.println("Welcome To Kodnest");
	greet(marks);
	}
	public static void greet(int marks)
	{
		if(marks>=80) {
			System.out.println("Welcome To Tech Club");
		}
	}
	

}
