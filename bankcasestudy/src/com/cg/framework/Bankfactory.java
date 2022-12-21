package com.cg.framework;

public abstract class Bankfactory {
	public abstract SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal);
	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal);
	
}