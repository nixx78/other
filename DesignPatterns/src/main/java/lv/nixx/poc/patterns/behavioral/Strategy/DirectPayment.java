package lv.nixx.poc.patterns.behavioral.Strategy;

import java.math.BigDecimal;

public class DirectPayment implements PaymentStrategy{

    @Override
    public BigDecimal pay(BigDecimal amount) {
        System.out.println("Direct payment executed, totals amount:" + amount);
        return amount;
    }
}
