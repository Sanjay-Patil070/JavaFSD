import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		double x=sc.nextDouble();
		System.out.println("Enter rate:");
		double y=sc.nextDouble();
		System.out.println("Enter time:");
		double z=sc.nextDouble();
		double v=(x*y*z)/100;
		System.out.println(v);
	}

}
