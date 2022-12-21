package com.cg.application;

import com.cg.framework.Bankfactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory  extends Bankfactory{
	SavingAcc acc1;
	CurrentAcc acc2;
	public  SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary) {
		return acc1 ;
		
		
	}
	public  CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit)
	{
		return acc2;
		
}
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal) {
		// TODO Auto-generated method stub
		

		return acc1;
	}
	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal) {
		// TODO Auto-generated method stub
		return acc2;
	}
}