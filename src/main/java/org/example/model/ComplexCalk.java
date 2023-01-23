package org.example.model;

public class ComplexCalk implements Calk{
    float a;
    float b;
    float c;
    float d;

    public ComplexCalk(NumberComplex num1, NumberComplex num2) {
        this.a = num1.getNumberFirst();
        this.b = num1.getNumberSecond();
        this.c = num2.getNumberFirst();
        this.d = num2.getNumberSecond();
    }

    @Override
    public NumberInteger sum() {
        return new NumberComplex(
                a+c,
                b+d);
    }

    @Override
    public NumberInteger subtraction() {
        return new NumberComplex(
                a-c,
                b-d);
    }

    @Override
    public NumberInteger multiplication() {
        return new NumberComplex(
                a*c-b*d,
                b*c+a*d);
    }

    @Override
    public NumberInteger division() {
        return new NumberComplex(
                (a*c+b*d)/(c*c+d*d),
                (b*c-a*d)/(c*c+d*d));
    }

}
