import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temperature in degree -F");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter= new TemperatureConverter();
		double temincelcius=temperatureConverter.converterFahrenheitToCelcius(f);
		System.out.println("temincelcius");
		

	}

}
