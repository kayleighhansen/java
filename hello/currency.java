package hello;

import java.util.Scanner;

class Main {

    static void exchangeUS_CAN(float us) {
        float can = us * 1.23f;
        System.out.println("\nCanadian Dollar: $" + can); 
    }

    static void exchangeUS_MXN(float us) {
        float mxn = us / 0.05f;
        System.out.println("\nMexican Pesos: $" + mxn); 
    }

    static void exchangeUS_EUR(float us) {
        float eur = us / 0.83f;
        System.out.println("\nEuros: $" + eur); 
    }

    static void exchangeUS_GBP(float us) {
        float gbp = us / 0.72f;
        System.out.println("\nBritish Pound: $" + gbp); 
    }

    static void exchangeUS_ALL(float us) {
        exchangeUS_GBP(us); 
        exchangeUS_CAN(us);
        exchangeUS_EUR(us); 
        exchangeUS_MXN(us); 
        System.out.println("\n\n"); 
    }

    static void display(char exchange, float us) {
        if (exchange == 'C') {
            exchangeUS_CAN(us);
        }
        else if (exchange == 'M') {
            exchangeUS_MXN(us); 
        }
        else if (exchange == 'E') {
            exchangeUS_EUR(us); 
        }
        else if (exchange == 'B') {
            exchangeUS_GBP(us); 
        }
        else if (exchange == 'A') {
            exchangeUS_ALL(us); 
        }
        else {
            System.out.println("Wrong Letter, Try Again"); 
            chooseCurrency();
        } 
    }

    static char chooseCurrency() {
        System.out.println("\nPick Your Currency");
        System.out.println("B. British Pound");
        System.out.println("C. Canadian Dollars");
        System.out.println("E. Euros");
        System.out.println("M. Mexican Pesos");
        System.out.println("A. All\n");


        char exchange;
        Scanner conversion = new Scanner(System.in); 
        exchange = conversion.next().charAt(0);

        return exchange;
    }

    static void start(){
        System.out.println("*********************");
        System.out.println("US Currency Converter\n");

        Scanner usd = new Scanner(System.in);
        System.out.println("US Currency: $");
        float us = usd.nextFloat(); 
        char exchange = chooseCurrency();

        display(exchange, us);
        goAgain();
    }

    static void goAgain(){
        char answer;
        Scanner goAgain = new Scanner(System.in);
        System.out.println("wanna go again? [y/n]");
        answer = goAgain.next().charAt(0);

        if (answer == 'y'){
            start();
        }
        else if (answer == 'Y'){
            start();
        }
        else {
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args) { 
        start();
    }
  } 