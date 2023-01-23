package org.example.controller;

import org.example.model.NumberComplex;
import org.example.model.NumberRational;

public  class InputConvert {

    public static NumberComplex convertToComplex(String inputMessage) {
        String[] temp = inputMessage.replaceAll("[()i]", "").split("\\+");
        return new NumberComplex(Float.parseFloat(temp[0]), Float.parseFloat(temp[1]));
    }

    public static NumberRational convertToRational(String inputMessage) {
        String[] temp = inputMessage.split("/");
        return new NumberRational(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
    }
}
