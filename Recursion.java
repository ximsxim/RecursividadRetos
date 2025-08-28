public class Recursion {
    /**
    * Funcion factorial de manera recursiva.
    * @param n valor a obtener factorial
    * @return factorial de n
    */
    public static long factorial(long n){
        long result=1; //Contador
        if (n <= 1){ //Caso de salida
            result = 1;
        } else {
            //caso recursivo
            result = n * factorial(n-1); 
        }
        return result;
    }

    /**
     * Función de Fibonacci de manera recursiva.      
     * @param n la posición de número fibonacci a buscar
     * @return número en esa posición
     */ 
    public static long fibonacci(long n){
        long result;
        if (n <= 0) {       
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            //caso recursivo
            result = fibonacci(n-1) + fibonacci(n-2); 
        }
        return result;
    }

    /**
     * Función que suma los dígitos de un número entero positivo usando recursión.
     * @param n número entero positivo
     * @return suma de sus dígitos
     */
    public static long sumaDigitos(long n){
        if (n == 0) { // caso base
            return 0;
        } else {
            return (n % 10) + sumaDigitos(n / 10); // caso recursivo
        }
    }

    public static void main(String[] args) {
        // puedes probar aquí si quieres
        System.out.println("Fibonacci de 12 = " + fibonacci(12));
        System.out.println("Suma de dígitos de 123 = " + sumaDigitos(123));
    }     
}
