package lv.nixx.poc.patterns.structural.Adapter;

import java.math.BigDecimal;

public class ExistingCoreSystem {

	public void createPayment(String account, BigDecimal amount) {
		System.out.println("create payment: " + account + ":" + amount);
	}
	
}
