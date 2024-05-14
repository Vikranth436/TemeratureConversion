package java1;
import java.util.Scanner;
public class Temperature {


	public static void main(String[] args) {
		ctof();
		
	}
	public static void  ctof() {
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter temperature in celsius - ");
		double celsius = sc1.nextDouble();
		double fahrenheit = (celsius*9/5) + 32;
		System.out.println("fahrenheit equivalent of " +celsius+" C = "+ fahrenheit+" F");
		
		
	}

}
