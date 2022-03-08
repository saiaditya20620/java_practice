package com.training.cg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BankTesting {
	public static void main(String args[]) {
		CurrentAccount cur1=new CurrentAccount(1000,"1A04H76");
		cur1.checkBalance();
		cur1.deposit(2000);
		cur1.withdraw(100);
		cur1.checkBalance();
		CurrentAccount cur2=new CurrentAccount(2000,"1A04H77");
		cur2.checkBalance();
		cur2.deposit(2000);
		cur2.withdraw(100);
		cur2.checkBalance();
		CurrentAccount cur3=new CurrentAccount(3000,"1A04H78");
		cur3.checkBalance();
		cur3.deposit(2000);
		cur3.withdraw(100);
		cur3.checkBalance();
		CurrentAccount cur4=new CurrentAccount(4000,"1A04H79");
		cur4.checkBalance();
		cur4.deposit(2000);
		cur4.withdraw(100);
		cur4.checkBalance();
		Set<Integer> hs = new TreeSet<Integer>();
		Set<CurrentAccount> curAccs=new HashSet<CurrentAccount>();
		curAccs.add(cur1);
		curAccs.add(cur2);
		curAccs.add(cur3);
		curAccs.add(cur4);
		System.out.println("details of 4 accounts");
		for(CurrentAccount c:curAccs ) {
			System.out.println("Initial balance of account "+c.AccounNumber+" is "+c.InitialBalance);
			System.out.println("Current balance of account "+c.AccounNumber +" is "+c.checkBalance());
			System.out.println("Current Interest rate of account "+c.AccounNumber +" is "+c.getInterest(1, 5));
			
		}
	
		
		
		
	}
	

}
