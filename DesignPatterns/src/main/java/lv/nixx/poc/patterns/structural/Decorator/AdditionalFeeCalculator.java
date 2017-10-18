package lv.nixx.poc.patterns.structural.Decorator;

import java.math.BigDecimal;

public class AdditionalFeeCalculator implements FeeCalculator {
	
	private FeeCalculator feeCalculator;
	
	public AdditionalFeeCalculator(FeeCalculator feeCalculator) {
		this.feeCalculator = feeCalculator;
	}

	@Override
	public BigDecimal calculateFee(BigDecimal amount) {
		BigDecimal originalFee = feeCalculator.calculateFee(amount);
		return originalFee.multiply(BigDecimal.valueOf(1.5));
	}

}
