package lv.nixx.poc.patterns.structural.Adapter;

import java.math.BigDecimal;

public class ExistingCoreSystemAdapter implements ExpectedInterface {
	
	ExistingCoreSystem core;
	
	public ExistingCoreSystemAdapter(ExistingCoreSystem core) {
		this.core = core;
	}

	@Override
	public void createTransaction(String currency, String account, BigDecimal amount) {
		core.createPayment(account, amount);
	}

}
