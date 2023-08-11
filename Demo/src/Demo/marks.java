package Demo;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the score");
		int score=Scan.nextInt();
		Grades grade=new Grades();
		grade.givegrade( score);
		

	}

}
