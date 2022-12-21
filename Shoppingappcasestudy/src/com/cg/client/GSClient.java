package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeACC;
import com.cg.application.GSShopFactory;

public class GSClient {

	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		GSNormalAcc gsn=(GSNormalAcc)factory.getNewNormalAccount(1212, "padmini", 600.00f);
		gsn.bookProduct(gsn.getCharges());
		GSPrimeACC gsp=(GSPrimeACC) factory.getNewPrimeAccount(12122, "suresh", 500.00f, true);
		gsp.bookProduct(gsp.getCharges());
	}
}
