package ATMMachine;

import java.util.Scanner;
class ATM{
	
	

		float Balance;
		int PIN=3456;
		int p =0;
	
	
	public void checkpin(){
		System.out.println("Enter your pin: " );
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
				if(enterpin==PIN) {
					menu();
				}else {
					System.out.println("Enter a valid pin: ");
				
					
				}
	}
	
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check Account Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		
		int opt = sc.nextInt();
		
		if(opt==1) {
			checkBalance();
		}else
		if(opt==2) {
			withdrawMoney();
		}else if(opt==3) {
			depositeMoney();
		}else if(opt==4) {
		    return;
		}else {
			System.out.println("Enter a valid pin");
			menu();
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+Balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.println("Bank Balance: "+Balance);
		System.out.println("Enter Amount To Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawn Successfully");
		}
		menu();
	}
	
	public void depositeMoney() {
		System.out.println("Enter the amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance+amount;
		System.out.println("Money Deposited Successfully");
		System.out.println("Bank Balance: "+ Balance);
	}
	public class ATMMachine {

	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkpin();
		
	}

}
}
