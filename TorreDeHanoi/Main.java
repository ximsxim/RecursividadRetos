package TorreDeHanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        System.out.println("=======================================");
        System.out.println("       SIMULACIÓN TORRE DE HANOI       ");
        System.out.println("=======================================");
        while (true) {
            System.out.print("Ingrese el número de discos : ");
            String s = sc.nextLine().trim();

            if (!s.matches("\\d+")) {
                System.out.println("Entrada inválida. Escribe un número entero positivo.");
                continue;
            }
            try {
                long val = Long.parseLong(s); 
                if (val < 1 || val > Short.MAX_VALUE) {
                    System.out.println("Usa un entero entre 1 y " + Short.MAX_VALUE + ".");
                    continue;
                }
                n = (short) val;
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Número no válido. Intenta de nuevo.");
            }
        }

        Divide.a.clear(); Divide.b.clear(); Divide.c.clear();
        for (int i = n; i >= 1; i--) {
            Divide.a.push(i);
        }

        System.out.println("\n--- Estado inicial ---");
        Divide.show();

        System.out.println("\n--- Resolviendo con " + n + " discos ---");
        Divide.hanoi(Divide.a, Divide.c, Divide.b, n);

    }
}