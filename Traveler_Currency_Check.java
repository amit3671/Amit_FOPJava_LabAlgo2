package payMoney;

import java.util.Arrays;
import java.util.Scanner;

public class Traveler_Currency_Check {
	
	Scanner sc = new Scanner(System.in);
	static int Array[];
	
	public void values_input(int limit) {
		Array = new int[limit];
		
		for(int i=0 ; i<limit ; i++) {
		Array[i]=sc.nextInt();
	    }
		
	}
	
	public void check_denominations(int limit, int price) {
		System.out.println("Your payment approach in order to give min no of notes will be");
		int sum = 0, k=0,p=0;
		int last = limit-1;
		while(sum!= price) {
			
			while(Array[last]<=(price-sum)) {
			sum = sum + Array[last];
			k++;
			p++;
			}
			if((price-sum)<=Array[last]) {
				
				if(p!=0) {
				System.out.println(Array[last]+" : "+k);
				p=0;
				}
				k=0;
			}
			last--;
		}
	}
	
	public void display(int limit) {
		for(int i=0;i<limit;i++)
		{
			System.out.print(Array[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	 Scanner s = new Scanner(System.in);
     Traveler_Currency_Check input = new Traveler_Currency_Check();
     
     System.out.println("Enter the size of currency denominations ");
     int noOfCurrency = s.nextInt();
     
     System.out.println("Enter the currency denominations value");
     input.values_input(noOfCurrency);
    
     Arrays.sort(Array);
     
     System.out.println("Enter the amount you want to pay");
     int amount = s.nextInt();
     
     input.check_denominations(noOfCurrency,amount);
	}

}
