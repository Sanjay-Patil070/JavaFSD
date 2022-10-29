import java.util.Scanner;

public class CM_Inches {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in CM:");
		double x=sc.nextDouble();
		double y=x/2.54;
		System.out.println(y);
		
	}

}
