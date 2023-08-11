package ArithmeticOperations;

import java.util.Scanner;

public class ArithmeticOperationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner (System.in);
		System.out.println("enter 2 numbers");
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		System.out.println(subtractNumbers (num1,num2));
		System.out.println(multiplyNumbers (num1,num2));
		System.out.println(divideNumbers (num1,num2));
		System.out.println(findRemainder (num1,num2));

	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num2-num1;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

}
