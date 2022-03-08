package com.training.cg;

class Account_Model implements Account{
	 double InitialBalance;
	 double TotalBalance;
	 double RateOfInterest;
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
		{
}
}
