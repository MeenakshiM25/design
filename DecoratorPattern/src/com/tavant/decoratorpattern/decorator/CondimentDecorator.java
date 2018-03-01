package com.tavant.decoratorpattern.decorator;

import com.tavant.decoratorpattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
