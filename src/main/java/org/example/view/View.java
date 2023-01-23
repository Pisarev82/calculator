package org.example.view;

import java.util.Scanner;

public class View {

    public void help() {
        System.out.println(
                "В рациональном числе должен присутствовать символ \"/\". \n" +
                "В комплексное число должно быть вида (1 + 2i) или (1.0 + 2.0i) ");
    }
    public String userInput(String outgoingMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(outgoingMessage);
        return sc.nextLine();
    }

    public void outputResult (String result) {
        System.out.println(result);
    }
}
