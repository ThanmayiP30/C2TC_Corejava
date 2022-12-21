package com.cg.framework;

public abstract class Bankaccount {
	protected int accNo;
	protected String accNm;
	protected float accBal;
	protected boolean isSalary;
	public abstract void withdraw(float accBal);
	public abstract void deposite(float accBal);
	@Override
	public String toString() {
		return "Bankaccount [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void Bankaccount(int accNo, String accNm, float accBal) {
		
	}


}
