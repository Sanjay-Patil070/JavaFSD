import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		int z=2;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the month:");
			String x=sc.next();
			String summerSeason="february,march,april,may";
			String rainySeason="june,july,august,septmber";
			String winterSeason ="october,november,december,january";
			if (summerSeason.contains(x)) {
				System.out.println("season is summer");
				
			} else if(rainySeason.contains(x))  {
				System.out.println("season is rainy");

			}
			else if(winterSeason.contains(x)) {
				System.out.println("season is winter");
			}
			else {
				System.out.println("invalid month");
			}
			
			
		} while (z!=0);
	
		
	}

}
