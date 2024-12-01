package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); //broke the line 
		String Name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n) ? "); 
		char Option = sc.next().charAt(0);
		if (Option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			banco = new Banco(accountNumber, Name, value);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(banco);
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			banco.depositValue(deposit);
			System.out.println("Updated account data: ");
			System.out.println(banco);
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			deposit = sc.nextDouble();
			banco.depositWithdraw(deposit);
			System.out.println("Updated account data: ");
			System.out.println(banco);
		} else {
			banco = new Banco(accountNumber, Name);
		}
			System.out.println("Account data: ");
			System.out.println(banco);
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			banco.depositValue(deposit);
			System.out.println("Updated account data: ");
			System.out.println(banco);
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			deposit = sc.nextDouble();
			banco.depositWithdraw(deposit);
			System.out.println("Updated account data: ");
			System.out.println(banco);

		sc.close();                                         
	}

}


