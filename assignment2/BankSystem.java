package assignment2;

import java.io.*;
import java.util.Scanner;


class InsufficientAmountException extends Exception{
	
	InsufficientAmountException(String s){
		super(s);
	}
}

interface Bank{
	void getDetails();
	void printDetails();
	void withdraw(float money) throws InsufficientAmountException;
}

enum AccountType{
	SAVINGS,
	CURRENT;
}
class ICICI implements Bank{
	public final static float SAVINGS = 4587;
	public final static float CURRENT = 8333;
	public final static int AccountNumber = 2000001878;
	public final static int ROI = 8;
	
	public void getDetails() {
		System.out.println("Rate of Interest is :" + ROI);
	}
	
	public void printDetails() {
		System.out.println("ICICI");
		System.out.println("Account Number: " + AccountNumber);
	}
	
	public void withdraw(float money) throws InsufficientAmountException{
		if(money > SAVINGS) {
			throw new InsufficientAmountException("Less Money");
		}
		
		else {
			float Balance = SAVINGS - money;
			System.out.println("Money is " + Balance);
		}
	}
}

class BOI implements Bank{
	public final static float SAVINGS = 4587;
	public final static float CURRENT = 8333;
	public final static int AccountNumber = 2000001878;
	public final static int ROI = 10;
	
	public void getDetails() {
		System.out.println("Rate of Interest is :" + ROI);
	}
	
	public void printDetails() {
		System.out.println("BOI");
		System.out.println("Account Number: " + AccountNumber);
	}
	
	public void withdraw(float money) throws InsufficientAmountException{
		if(money > SAVINGS) {
			throw new InsufficientAmountException("Less Money");
		}
		
		else {
			float Balance = SAVINGS - money;
			System.out.println("Money is " + Balance);
		}
	}
}

class SBI implements Bank{
	public final static float SAVINGS = 4587;
	public final static float CURRENT = 8333;
	public final static int AccountNumber = 2000001878;
	public final static int ROI = 12;
	

	
	public void getDetails() {
		System.out.println("Rate of Interest is :" + ROI);
	}
	
	public void printDetails() {
		System.out.println("SBI");
		System.out.println("Account Number: " + AccountNumber);
	}
	
	public void withdraw(float money) throws InsufficientAmountException{
		if(money > SAVINGS) {
			throw new InsufficientAmountException("Less Money");
		}
		
		else {
			float Balance = SAVINGS - money;
			System.out.println("Money is " + Balance);
		}
	}
}


public class BankSystem {

	public static void main(String[] args) throws InsufficientAmountException {
		ICICI icici = new ICICI();
		BOI boi = new BOI();
		SBI sbi = new SBI();
		
		int opt ;
		Scanner inp = new Scanner(System.in);
		char YoN = 'y';
		while(YoN != 'n') {
		
		System.out.println("Enter your Bank \n1.SBI\n2.ICICI\n3.BOI");
		opt = inp.nextInt();
		
		System.out.println("Enter amount to be Withdrawn");
		float amount = inp.nextInt();
		
		switch(opt) {
		case 1:	sbi.withdraw(amount);
				
				sbi.printDetails();
				sbi.getDetails();
				float sCurrent = SBI.CURRENT;
				System.out.println("The current balance is " + sCurrent);
				break;
				
		case 2: icici.withdraw(amount);
				icici.printDetails();
				icici.getDetails();
				float iCurrent = ICICI.CURRENT;
				System.out.println("The current balance is " + iCurrent);
				break;
				
		case 3:boi.withdraw(amount);
			   boi.printDetails();
			   boi.getDetails();
			   float bCurrent = BOI.CURRENT;
			   System.out.println("The current balance is " + bCurrent);
			   break;
			   
		case 4: System.out.println("Good day");
		}
		System.out.println("Do you want to continue press y for yes and n for no");
		YoN = inp.next().charAt(0);
		}
	}

}
