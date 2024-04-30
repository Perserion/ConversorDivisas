package interfaz;

import java.util.Scanner;

import conversion.CurrencyConverter;

import static conversion.CurrencyConverter.convertCurrency;

public class main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int choice;
            do {
                System.out.println();
                System.out.println();
                System.out.println("Seleccione una opción:");
                System.out.println();
                System.out.println(("**********************"));
                System.out.println(("**********************"));
                System.out.println(("**********************"));
                System.out.println();
                System.out.println("1. Convertir USD a ARS");
                System.out.println();
                System.out.println("2. Convertir USD a BOB");
                System.out.println();
                System.out.println("3. Convertir USD a BRL");
                System.out.println();
                System.out.println("4. Convertir USD a CLP");
                System.out.println();
                System.out.println("5. Convertir USD a COP");
                System.out.println();
                System.out.println("0. Salir");
                System.out.println();
                System.out.print("Elija una opción: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        CurrencyConverter.convertCurrency ("ARS",getAmount());
                        break;
                    case 2:
                        CurrencyConverter.convertCurrency("BOB", getAmount());
                        break;
                    case 3:
                        CurrencyConverter.convertCurrency  ("BRL", getAmount());
                        break;
                    case 4:
                     CurrencyConverter.convertCurrency("CLP", getAmount());
                        break;
                    case 5:

                        CurrencyConverter.convertCurrency   ("COP", getAmount());
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } while (choice != 0);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }


    }

    private static double getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en USD: ");
        double amount = scanner.nextDouble();
        return amount;
    }
}





