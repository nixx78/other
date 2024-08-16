package lv.nixx.poc.patterns.structural.Decorator;

import lv.nixx.poc.patterns.structural.Decorator.existing.BaseFeeCalculator;
import lv.nixx.poc.patterns.structural.Decorator.existing.FeeCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


class DecoratorSampleTest {

    @Test
    void decoratorChainSample() {

        FeeCalculator decoratedCalculator = new ExtraFeeCalculator(
                new AdditionalFeeCalculator(
                        new BaseFeeCalculator()
                )
        );

        assertThat(decoratedCalculator.calculateFee(BigDecimal.valueOf(10)))
                .isEqualTo(BigDecimal.valueOf(10 + 1 + 10 + 20));

    }

    @Test
    void singleDecoratorTest() {
        BaseFeeCalculator feeCalculator = new BaseFeeCalculator();

        FeeCalculator additionalFeeCalculator = new AdditionalFeeCalculator(feeCalculator);

        BigDecimal amount = BigDecimal.valueOf(10);

        BigDecimal valueFromOriginal = feeCalculator.calculateFee(amount);
        BigDecimal valueFromDecorator = additionalFeeCalculator.calculateFee(amount);

        assertAll(
                () -> assertThat(valueFromOriginal).isEqualTo(BigDecimal.valueOf(11)),
                () -> assertThat(valueFromDecorator).isEqualTo(BigDecimal.valueOf(21))
        );

    }

}
