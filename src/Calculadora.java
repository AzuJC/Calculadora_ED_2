/**
 * Esta clase implementa el menú principal de una calculadora.
 * Maneja la interacción con el usuario para realizar diversas operaciones matemáticas,
 * incluyendo divisiones y raíces cuadradas, delegando los cálculos a la clase Division.
 *
 * @todo Actualmente, el manejo de excepciones es básico y va a mejorarse en futuras versiones.
 *
 * @author Azucena Jimenez Castaneda <geoazu.flysch@gmail.com>
 * @see Cociente
 * @version 1.0
 * @since 2025
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cociente cociente = new Cociente();
        DecimalFormat df = new DecimalFormat("#.###");

        while (true) {
            System.out.println("\nMain menu"
                    + "\n1. Cociente"
                    + "\n2. Suma"
                    + "\n3. Resta"
                    + "\n4. Multiplicación"
                    + "\n5. Exit\n");
            System.out.print("Ingrese su elección: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            switch (choice) {
                case 1: // División
                    while (true) {
                        System.out.println("\nOpciones de División"
                                + "\nA. Raíz"
                                + "\nB. División reales"
                                + "\nC. División enteros"
                                + "\nD. Inversa"
                                + "\nE. Volver al menú principal");
                        System.out.print("Ingrese su elección: ");
                        char subChoice = scanner.next().toUpperCase().charAt(0);

                        if (subChoice == 'E') break;

                        try {
                            switch (subChoice) {
                                case 'A': // Raíz
                                    System.out.print("Ingrese un número: ");
                                    double numRaiz = scanner.nextDouble();
                                    System.out.println("Resultado: " + df.format(cociente.raiz(numRaiz)));
                                    break;

                                case 'B': // División reales
                                    System.out.print("Ingrese el dividendo: ");
                                    double num1Reales = scanner.nextDouble();
                                    System.out.print("Ingrese el divisor: ");
                                    double num2Reales = scanner.nextDouble();
                                    System.out.println("Resultado: " + df.format(cociente.dividorReales(num1Reales, num2Reales)));
                                    break;

                                case 'C': // División enteros
                                    System.out.print("Ingrese el dividendo: ");
                                    int num1Enteros = scanner.nextInt();
                                    System.out.print("Ingrese el divisor: ");
                                    int num2Enteros = scanner.nextInt();
                                    System.out.println("Resultado: " + cociente.dividorEnteros(num1Enteros, num2Enteros));
                                    break;

                                case 'D': // Inversa
                                    System.out.print("Ingrese un número: ");
                                    double numInverso = scanner.nextDouble();
                                    System.out.println("Resultado: " + df.format(cociente.inversoReal(numInverso)));
                                    break;

                                default:
                                    System.out.println("Opción no válida. Elija una opcion de la division.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Elije una opcion del main menu");
            }
        }
        scanner.close();
    }
}



