package lv.nixx.poc.patterns.structural.Decorator;

import java.math.BigDecimal;

public interface FeeCalculator {

	public BigDecimal calculateFee(BigDecimal amount); 
	
}
