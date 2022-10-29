import java.util.Scanner;

public class Inches_CM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght in inch:");
		double x=sc.nextDouble();
		double y=x*2.54;
		System.out.println(y);
	}

}
