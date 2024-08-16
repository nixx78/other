package lv.nixx.poc.patterns.structural.Decorator;

import lv.nixx.poc.patterns.structural.Decorator.existing.FeeCalculator;

import java.math.BigDecimal;

// Класс декоратор, который добавляет новую функциональность к уже сущесвующему классу FeeCalculator
public class ExtraFeeCalculator extends FeeCalculatorDecorator {

    public ExtraFeeCalculator(FeeCalculator feeCalculator) {
        super(feeCalculator);
    }

    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        BigDecimal originalFee = feeCalculator.calculateFee(amount);
        return originalFee.add(BigDecimal.valueOf(20));
    }

}
