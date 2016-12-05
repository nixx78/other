package lv.nixx.poc.patterns.structural.Adapter;

import java.math.BigDecimal;

public interface ExpectedInterface {
	public void createTransaction(String currency, String account, BigDecimal amount);
}
