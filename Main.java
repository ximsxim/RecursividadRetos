import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n~~ MENÚ ~~");
            System.out.println("1) Calcular Factorial");
            System.out.println("2) Calcular Fibonacci");
            System.out.println("3) Suma de dígitos");
            System.out.println("4) Salir");
            System.out.print("Elige opción: ");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida.");
                sc.nextLine(); 
                continue;
            }

            try {
                if (opcion == 1) {
                    System.out.print("Número: ");
                    long n = sc.nextLong();
                    if (n < 0) {
                        System.out.println("Debe ser >= 0.");
                    } else {
                        System.out.println("Factorial = " + Recursion.factorial(n));
                    }
                } else if (opcion == 2) {
                    System.out.print("Número: ");
                    long n = sc.nextLong();
                    if (n < 0) {
                        System.out.println(" Debe ser >= 0.");
                    } else {
                        System.out.println("Fibonacci = " + Recursion.fibonacci(n));
                    }
                } else if (opcion == 3) {
                    System.out.print("Número: ");
                    long n = sc.nextLong();
                    if (n < 0) {
                        System.out.println("Debe ser >= 0.");
                    } else {
                        System.out.println("Suma de dígitos = " + Recursion.sumaDigitos(n));
                    }
                } else if (opcion != 4) {
                    System.out.println(" Opción inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Escribe un número entero.");
                sc.nextLine(); 
            }

        } while (opcion != 4);

        sc.close();
        System.out.println("Saliendo...");
    }
}
