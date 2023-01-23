package org.example.model;

public class NumberComplex extends NumberInteger{
    private float numberFirst;
    private float numberSecond;

    public NumberComplex(float numberFirst, float numberSecond) {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
    }

    public float getNumberFirst() {
        return numberFirst;
    }

    public float getNumberSecond() {
        return numberSecond;
    }

    @Override
    public String toString() {
        return "(" + numberFirst +
                " + " + numberSecond +
                "i)";
    }
}
