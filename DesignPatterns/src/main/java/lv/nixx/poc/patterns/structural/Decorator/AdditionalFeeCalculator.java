package lv.nixx.poc.patterns.structural.Decorator;

import lv.nixx.poc.patterns.structural.Decorator.existing.FeeCalculator;

import java.math.BigDecimal;

public class AdditionalFeeCalculator extends FeeCalculatorDecorator {

    public AdditionalFeeCalculator(FeeCalculator feeCalculator) {
        super(feeCalculator);
    }

    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        BigDecimal originalFee = feeCalculator.calculateFee(amount);
        return originalFee.add(BigDecimal.valueOf(10));
    }

}
