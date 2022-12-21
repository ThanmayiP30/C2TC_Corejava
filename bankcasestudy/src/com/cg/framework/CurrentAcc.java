package com.cg.framework;

public abstract class CurrentAcc extends Bankaccount  {
	protected float creditLimit;
	public abstract void  withdraw(float accBal);
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void CurrentAcc(int accNo, String accNm, float accBal,float creditLimit ) {


}
}
