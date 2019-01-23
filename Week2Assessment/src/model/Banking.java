package model;

public class Banking {
	public static double monthlyInterestEarned(double apr, double amount) {
		double monthlyInterest = (((apr/12)/100)*amount);
		return monthlyInterest;
	}
	
	public static double endOfMonthAmount(double apr, double amount) {
		double endOfMonth = monthlyInterestEarned(apr,amount)+amount;
		return endOfMonth;
	}
	
	public static double yearlyInterestEarned(double apr, double amount) {
		double interest = (apr/100)*amount;
		return interest;
	}
	
	public static double endOfYearAmount(double apr, double amount){
		double endOfYear = yearlyInterestEarned(apr, amount)+amount;
		return endOfYear;
	}
}
