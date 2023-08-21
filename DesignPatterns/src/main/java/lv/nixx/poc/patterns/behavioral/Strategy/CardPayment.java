package lv.nixx.poc.patterns.behavioral.Strategy;

import java.math.BigDecimal;

public class CardPayment implements PaymentStrategy{

    @Override
    public BigDecimal pay(BigDecimal amount) {
        BigDecimal totalAmount = amount.add(BigDecimal.valueOf(1.00));
        System.out.println("Card payment executed, totals amount:" + totalAmount);
        return totalAmount;
    }
}
