package Excep;
import java.util.Scanner;
public class Account {
		int pin;
		double balance;
		public Account(int pin,double balance) {
		this.pin=pin;
		this.balance=balance;
		}
		public void withdrawMoney() {
		try (Scanner sa = new Scanner(System.in)) {
		System.out.println("Enter the pin");
		int pin=sa.nextInt();
		if(this.pin==pin) {
		System.out.println("Enter tamt to withdraw");
		double amount=sa.nextDouble();
		if(amount<=balance) {
		balance=balance-amount;
	    System.out.println("collect your cash");
	    }
		else {
		throw new InsufficientBalanceException("your fund is less");
		}
		}
		}
		catch(InsufficientBalanceException e) {
		}
		finally {
		System.out.println("thankyou for using");
		}
		 }
		public static void main(String[] args) {
		Account a=new Account(1212,20000d);
		a.withdrawMoney();
		a.checkBalance();
		}
		public void checkBalance() {
		System.out.println(balance);
		}
		}