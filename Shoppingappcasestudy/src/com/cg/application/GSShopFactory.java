package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{
PrimeAcc acc1;
NormalAcc acc2;
	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, Float charges, Boolean isPrime) 
	{
		acc1=new GSPrimeACC(AccNo,accNm,charges,isPrime);
		return acc1;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, Float charges)
	{
		acc2=new GSNormalAcc(AccNo,accNm,charges);
		return acc2;
	
    }
}
