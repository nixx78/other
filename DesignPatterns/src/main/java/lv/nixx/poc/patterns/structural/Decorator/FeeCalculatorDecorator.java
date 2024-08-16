package lv.nixx.poc.patterns.structural.Decorator;


import lv.nixx.poc.patterns.structural.Decorator.existing.FeeCalculator;

/* Класс FeeCalculatorDecorator служит базовым классом для всех декораторов.
 Это позволяет избежать дублирования кода и обеспечивает единое место, откуда все декораторы могут наследоваться.
 В будущем, если потребуется изменить общую логику для всех декораторов
 (например, добавить общую функциональность или изменить способ делегирования), это можно сделать в одном месте.
 */
public abstract class FeeCalculatorDecorator implements FeeCalculator {

    protected final FeeCalculator feeCalculator;

    protected FeeCalculatorDecorator(FeeCalculator feeCalculator) {
        this.feeCalculator = feeCalculator;
    }
}
