package TorreDeHanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("       SIMULACIÓN TORRE DE HANOI       ");
        System.out.println("=======================================");
        System.out.print("Ingrese el número de discos: ");

        short n = sc.hasNextShort() ? sc.nextShort() : 4;
        if (n < 1) n = 1;

        Divide.a.clear(); Divide.b.clear(); Divide.c.clear();
        for (int i = n; i >= 1; i--) {
            Divide.a.push(i);
        }

        System.out.println("\n--- Estado inicial ---");
        imprimirTorres();

        System.out.println("\n--- Resolviendo con " + n + " discos ---");
        Divide.hanoi(Divide.a, Divide.c, Divide.b, n);

    }

    private static void imprimirTorres() {
        System.out.printf("Torre A: %-15s\n", Divide.a);
        System.out.printf("Torre B: %-15s\n", Divide.b);
        System.out.printf("Torre C: %-15s\n", Divide.c);
        System.out.println("---------------------------------------");
    }
}