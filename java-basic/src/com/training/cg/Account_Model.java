package com.training.cg;

class Account_Model implements Account{
	 double InitialBalance;
	 double TotalBalance;
	 double RateOfInterest;
	 String AccounNumber;
		@Override
		public double deposit(double amount) {
			TotalBalance+=amount;
			return TotalBalance;
		}

		@Override
		public double withdraw(double amount) {
			if(TotalBalance<=InitialBalance) {
				
				System.out.println("Insufficient amount");
				return TotalBalance-=amount;
		}
			else {
				return TotalBalance-=amount;
				
		}	
		}
		@Override
		public double checkBalance() {
			return TotalBalance;
		}

		@Override
		public double getInterest(double timeperiod, double rateofinterest) {
			double SI=(TotalBalance*(rateofinterest)*timeperiod)/100;
			return SI;
		}



}
