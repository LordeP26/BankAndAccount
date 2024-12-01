package entities;

public class Banco {
	private int accountNumber;
    private String Name;
	private double value;

	//construtores
	
	public Banco() {	
	}
	public Banco(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.Name = name;
		depositValue(initialDeposit); //protecting the constructor to changes in deposit in the future 
	}
	public Banco(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.Name = name;
	}
	
	// encapsulamento
	
	public void setName(String name) {
		this.Name = name;
	}
	public String getName(String name) {
		return name;
	}
	public String getAccountNumber(String accountNumber) {
		return accountNumber;
	}
	public double getValueAccount(double value) {
		return value;
	}
	
	//método: 
	
	public void depositValue(double value) { // void because references the original value in the account
		 this.value += value;
	}
	public void depositWithdraw(double value) { // void because references the original value in the account
		 this.value -= value + 5;
	}
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + Name +", Balance: $" + String.format("%.2f",value);
	}
}