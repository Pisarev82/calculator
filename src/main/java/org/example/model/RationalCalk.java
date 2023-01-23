package org.example.model;

public class RationalCalk implements Calk{
    int a;
    int b;
    int c;
    int d;

    public RationalCalk(NumberRational num1, NumberRational num2) {
        this.a = num1.getNumerator();
        this.b = num1.getDenominator();
        this.c = num2.getNumerator();
        this.d = num2.getDenominator();
    }

    @Override
    public NumberInteger sum() {
        return new NumberRational(
                a*d + c*b,
                b*d);
    }

    @Override
    public NumberInteger subtraction() {
        return new NumberRational(
                a*d - c*b,
                b*d);
    }

    @Override
    public NumberInteger multiplication() {
        return new NumberRational(
                a*c,
                b*d);
    }

    @Override
    public NumberInteger division() {
        return new NumberRational(
                a*d,
                b*c);
    }
}
