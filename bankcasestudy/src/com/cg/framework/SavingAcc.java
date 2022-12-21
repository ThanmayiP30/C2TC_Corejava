package com.cg.framework;

public abstract class SavingAcc extends Bankaccount {
	protected boolean isSalary;
	public abstract void withdraw(float accBal);
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public void SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
	}
	}

