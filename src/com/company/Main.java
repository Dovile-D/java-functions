package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        print();
        print("Įveskite darbuotojo normos vykdymą žemiau normos/ norma/ aukščiau normos:");
        double coefficient = getCoefficient();
        print("Įveskite darbuotojo bazinį atlyginimą:");
        double salary = getSalary(coefficient, s.nextDouble());
        print("Darbuotojo galutinis atlyginimas, Eur: ", Double.toString(salary));

    }

    /**
     * Funkcija, kuri pagal vartotojo ivesta norma grazina atlyginimo koeficienta
     * @return - atlyginimo koeficienta
     */
    static double getCoefficient() {

        Scanner scan = new Scanner(System.in);
        String userQuata = scan.nextLine();
        double result = 0.0;
        if (userQuata.equalsIgnoreCase("žemiau normos")) {
            result = 0.5;
        } else if (userQuata.equalsIgnoreCase("norma")) {
            result = 1.0;
        } else if (userQuata.equalsIgnoreCase("aukščiau normos")) {
            result = 1.5;
        }
        return result;
    }

    /**
     * Funkcija, kuri pagal vartotojo ivesta pradini atlyginima ir perduodama koeficienta paskaiciuoja darbuotojo
     * galutini atlyginima
     * @param coefficient - perduodamas atlyginimo koeficientas
     * @param primarySalary - vartotojo ivestas pradinis darbuotojo atlyginimas
     * @return - darbuotojo galutinis atlyginimas
     */
    static double getSalary(double coefficient, double primarySalary) {
        return coefficient * primarySalary;
    }


    /**
     * Funkcija, kuri isveda pateikta teksta
     * @param text - pirminis tekstas
     * @param value - perduodama teksto eilute
     */
    static void print(String text, String value) {
        System.out.println(text + value);
    }

    static void print(String text) {
        System.out.println(text);
    }

    static void print() {
        System.out.println("Programa atlyginimų skaičiavimui");
    }

}

