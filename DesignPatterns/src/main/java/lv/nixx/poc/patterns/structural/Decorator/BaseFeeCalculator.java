package lv.nixx.poc.patterns.structural.Decorator;

import java.math.BigDecimal;

public class BaseFeeCalculator implements FeeCalculator {

	@Override
	public BigDecimal calculateFee(BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(1.2));
	}

}
