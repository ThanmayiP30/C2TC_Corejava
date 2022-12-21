package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;

public class MMClient {
	public static void main(String[] args) {
		MMBankFactory factory=new MMBankFactory();
		MMCurrentAcc gsn=(MMCurrentAcc)factory.getNewCurrentAccount(895581212, "Thanmayi", 6040.00f);
		gsn.withdraw(gsn.getAccBal());
		MMSavingAcc gsp=(MMSavingAcc) factory.getNewSavingAccount(1218529622, "purushotham", 5000.00f, true);
		gsp.withdraw(gsp.getAccBal());

}

	public static void main(String[] args) {
			MMBankFactory factory=new MMBankFactory();
			MMCurrentAcc gsn=(MMCurrentAcc)factory.getNewCurrentAccount(895581212, "Thanmayi", 6040.00f);
			gsn.withdraw(gsn.getAccBal());
			MMSavingAcc gsp=(MMSavingAcc) factory.getNewSavingAccount(1218529622, "purushotham", 5000.00f, true);
			gsp.withdraw(gsp.getAccBal());
	
	}
}
