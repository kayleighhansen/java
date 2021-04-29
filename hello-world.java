import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("*************************");
        System.out.println("  US Currency Converter  ");

        float us, can;
        Scanner canada = new Scanner(System.in);
        System.out.println("US Currency: $");

        us = canada.nextFloat(); 

        System.out.println("US Currency: $");

        can = us * 1.23f; 

        canada.close();
        System.out.println("Canadian Currency: $" + can); 
    }
  } 