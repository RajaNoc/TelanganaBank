//Account.java - Raja

public class Account
{
	private double balance;
	private double interest;

	public Account()
	{
		balance = 1000;
		interest = 9;
	}

	public Account(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}
