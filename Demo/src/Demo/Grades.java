package Demo;

public class Grades{

	void givegrade(int score) {
		// TODO Auto-generated method stub
		if(score>=90)
		{
			System.out.println("Grase A+");
		}
		else if(score>=80 && score<90)
		{
			System.out.println("Grase A");
		}
		else if(score>=70 && score<80)
		{
			System.out.println("Grase B");
		}
		else if(score>=60 && score<70)
		{
			System.out.println("Grase C");
		}
		else if(score>=50 && score<60)
		{
			System.out.println("Grase D");
		}
		else
		{
			System.out.println("Fail...");
		}

	}

}
