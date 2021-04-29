import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
      float us, can;
      Scanner canada = new Scanner(System.in);
      System.out.println("US Currency: $");

      us = canada.nextFloat(); 
      can = us * 1.23f; 

      canada.close();
      System.out.println("Canadian Currency: $" + can); 
    }
  } 