package org.example.controller;

import org.example.model.*;
import org.example.view.View;

public class ControllerMain {
    private final View view = new View();
    private final InputValidation validation = new InputValidation();
    private String result = "";
    private String operator = "";
    private NumberInteger intermediateResult;
    private boolean isOperatorEntered = false;

    public void run() {
        String message = "Введите число (для завершения программы введите q)";
        view.help();
        while (true) {
            String userInput = view.userInput(message);
            if (userInput.equalsIgnoreCase("q")) {
                break;
            } else if (validation.isRationalInput(userInput)) {
                result += InputConvert.convertToRational(userInput).toString();
                intermediateResult = tryMath(intermediateResult, InputConvert.convertToRational(userInput));
                message = "Введите математический оператор (для завершения программы введите q)";
            } else if (validation.isComplexInput(userInput)) {
                result += InputConvert.convertToComplex(userInput).toString();
                intermediateResult = tryMath(intermediateResult, InputConvert.convertToComplex(userInput));
                message = "Введите математический оператор (для завершения программы введите q)";
            } else if (validation.isOperator(userInput)) {
                operator = userInput;
                result += " " + userInput.substring(0,1) + " ";
                isOperatorEntered = true;
                message = "Введите число (для завершения программы введите q)";
            } else {
                view.help();
            }
            view.outputResult(result);
        }
    }

    private NumberInteger tryMath(NumberInteger intermediateResult, NumberInteger nextNumber) {
        if (intermediateResult != null && isOperatorEntered) {
            Calk calk = null;
            if (intermediateResult instanceof NumberComplex && nextNumber instanceof NumberComplex) {
                calk = new ComplexCalk((NumberComplex) intermediateResult, (NumberComplex) nextNumber);
            } else if (intermediateResult instanceof NumberRational && nextNumber instanceof NumberRational) {
                calk = new RationalCalk((NumberRational) intermediateResult, (NumberRational) nextNumber);
            } else {
                if (nextNumber instanceof NumberComplex) {
                    System.out.println("Нельзя складывать комплексное и рациональное число. Введите комплексное число.");
                } else {
                    System.out.println("Нельзя складывать комплексное и рациональное число. Введите рациональное число.");
                }
            }
            if (calk != null) {
                switch (operator) {
                    case ("+") -> {
                        result += " = " + calk.sum();
                        return calk.sum();
                    }
                    case ("-") -> {
                        result += " = " + calk.subtraction();
                        return calk.subtraction();
                    }
                    case ("*") -> {
                        result += " = " + calk.multiplication();
                        return calk.multiplication();
                    }
                    case ("/") -> {
                        result += " = " + calk.division();
                        return calk.division();
                    }
                }
            }
        }
        return nextNumber;
    }
}
