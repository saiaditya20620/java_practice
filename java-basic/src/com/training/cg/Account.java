package com.training.cg;

interface Account {
	public double deposit(double amount);
	public double withdraw(double amount);
	public double checkBalance();
	public double getInterest(double timeperiod,double rateofinterest);

}
