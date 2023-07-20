package payMoney;

import java.util.Scanner;

public class PayMoney_Transaction_Logs {
	
	Scanner Obj = new Scanner(System.in);
	int amounts[];
	
	public void transaction_input(int limit) {
		 amounts = new int[limit];
		 for(int i=0 ; i<limit ; i++) {
			 amounts[i]= Obj.nextInt();
		 }
	}
	
	public void Target(int target, int limit) {
		int i=0;
		int sum=0;
		while(sum<target && i<limit) {
			sum += amounts[i];
			i++;
		}
		if(sum>=target) {
			System.out.println("Target achieved after "+ i + " transactions \n");
		}
		else
			System.out.println("Given target is not achieved \n");
			}

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    PayMoney_Transaction_Logs Trans = new PayMoney_Transaction_Logs();
		
        System.out.println("Enter the size of transaction array");
		int noOfTransaction = input.nextInt();
		
		System.out.println("Enter the values of array");
		Trans.transaction_input(noOfTransaction);
		
		System.out.println("Enter the total no. of targets that needs to be achived");
		int noOfTargets = input.nextInt();
		int count=0;
		
		while(count<noOfTargets) {
		System.out.println("Enter the value of target");
		int Tg = input.nextInt();
		Trans.Target(Tg, noOfTransaction);
		count++;
		}
	}

}
