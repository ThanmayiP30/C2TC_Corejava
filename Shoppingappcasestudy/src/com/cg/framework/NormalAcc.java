package com.cg.framework;

public abstract class NormalAcc {
	private final float deliveryCharge=50;
	public NormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
			}
	public float getDelivaryCharges()
	{
		return deliveryCharge;
	}
	public void bookProduct(float  deliveryCharge)
	{
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}

