import java.util.Scanner;

public class Bonus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary:");
	double x=sc.nextDouble();
	System.out.println("Enter bonus %:");
	double y=sc.nextDouble();
	System.out.println("total salary:");
	double z=x+(y/100)*x;
	System.out.println(z);
	
	
}
}
