package Assignment;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your age and weight");
		int age=scan.nextInt();
		int weight=scan.nextInt();
		if(age>=25)
		{
			if(weight>=50)
			{
				System.out.println("you are eligible to weight lift");
			}
		}
		else if (age>=20 && age<=50)
		{
		if (weight>=40 && age<=50)
			{
			System.out.println("you are not eligible to weight lift");
			}
		}
		else 
		{
		System.out.println("please check your age and weight");
		}
		}
	}
