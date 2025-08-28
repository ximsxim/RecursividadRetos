public class Recursion {
    /**
    * Funcion factorial de manera recursiva.
    */
    public static long factorial(long n){
        long result=1;
        if (n <= 1){
            result = 1;
        } else {
            result = n * factorial(n-1); 
        }
        return result;
    }

    /**
     * Función de Fibonacci de manera recursiva.
     */
    public static long fibonacci(long n){
        long result;
        if (n <= 0) {       
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fibonacci(n-1) + fibonacci(n-2); 
        }
        return result;
    }

    /**
     * Suma de dígitos de un número entero positivo usando recursión.
     */
    public static long sumaDigitos(long n){
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    /**
     * Invertir una cadena de texto usando recursión.
     */
    public static String invertirCadena(String cadena){
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        } else {
            return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }

    /**
     * Contar vocales en una cadena usando recursión.
     */
    public static int contarVocales(String cadena){
        if (cadena == null || cadena.isEmpty()) {
            return 0; 
        } else {
            char c = Character.toLowerCase(cadena.charAt(0));
            int suma = (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ? 1 : 0;
            return suma + contarVocales(cadena.substring(1)); 
        }
    }
}