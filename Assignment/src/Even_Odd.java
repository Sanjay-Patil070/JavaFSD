import java.util.Scanner;

public class Even_Odd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		int y=x%2;
		
	if (y==0) 
	{
		System.out.println("Even");
		
	} 
	else 
	{
		System.out.println("Odd");

	}
}

}
