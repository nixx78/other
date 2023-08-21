package lv.nixx.poc.patterns.behavioral.Strategy;

import java.math.BigDecimal;

public class DelayedPayment implements PaymentStrategy{
    @Override
    public BigDecimal pay(BigDecimal amount) {
        BigDecimal totalAmount = amount.add(BigDecimal.valueOf(10.00));
        System.out.println("Delayed payment executed, totals amount:" + totalAmount);
        return totalAmount;
    }
}
