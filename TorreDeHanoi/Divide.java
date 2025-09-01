package TorreDeHanoi;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide {

    static Stack<Integer> a = new Stack<>(),
                          b = new Stack<>(),
                          c = new Stack<>();

    /**
    * 
    * @param a Torre A
    * @param b Torre B
    * @param c Torre C 
    * @param n número de elementos
    */ 
    public static void hanoi(Stack a, Stack b, Stack c, int n)
    {
      if (n==1)
      {
        move(a,b);
        show();
      } 
      else 
      {
        hanoi(a,c,b,n-1);
        move(a,b);
        show();
        hanoi(c,b,a,n-1);
      }
    }

    /**
     * Mover el disco del tope de A hacia B
     * @param a
     * @param b 
     */ 
    public static void move(Stack a, Stack b){
        try {
           b.push(((Stack<Integer>)a).pop());
        } catch (Exception ex) {
          Logger.getLogger(Divide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void show() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("----------------------");
    }
}