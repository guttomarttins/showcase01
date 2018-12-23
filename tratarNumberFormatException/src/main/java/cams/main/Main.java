/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cams.main;

/**
 *
 * @author Carlos
 */
public class Main {

    private static final String STR1 = "398475";
    private static final String STR2 = "0.34";
    private static final String STR3 = "123.234";
    private static final String STR4 = "123!234";

    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(STR1);
            System.out.println("Value parsed :" + a);
        } catch (NumberFormatException e) {
            System.out.println("valor inválido... ".concat(STR1));
             System.out.println("Erro: ".concat(e.toString()));
        }

        try {
            int b = Integer.parseInt(STR2);
            System.out.println("Value parsed :" + b);
        } catch (NumberFormatException e) {
            System.out.println("valor inválido... ".concat(STR2));
             System.out.println("Erro: ".concat(e.toString()));
        }

        try {
            float c = Float.valueOf(STR3);
            System.out.println("Value parsed :" + c);
        } catch (NumberFormatException e) {
            System.out.println("valor inválido... ".concat(STR3));
             System.out.println("Erro: ".concat(e.toString()));
        }

        try {
            float d = Float.valueOf(STR4);
            System.out.println("Value parsed :" + d);
        } catch (NumberFormatException e) {
            System.out.println("valor inválido... ".concat(STR4));
            System.out.println("Erro: ".concat(e.toString()));
        } 

    }
}
