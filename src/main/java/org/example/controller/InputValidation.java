package org.example.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    public boolean isComplexInput(String userInput) {
        String regex = "^\\([+-]?((\\d+\\.?\\d*)|(\\.\\d+))\\+((\\d+\\.?\\d*)|(\\.\\d+))i\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput.trim().replaceAll("\\s", ""));
        return matcher.find();
    }

    public boolean isRationalInput(String userInput) {
        String regex = "^[0-9]+/[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.find();
    }

    public boolean isOperator(String userInput) {
        String regex = "^[+/\\-*]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput.trim());

        return matcher.find();
    }
}
