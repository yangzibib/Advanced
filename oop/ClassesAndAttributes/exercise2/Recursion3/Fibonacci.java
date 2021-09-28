package exercise2.Recursion3;

import exercise2.Recursion2.Recursion;
import org.junit.Test;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Fibonacci {
   public int fibonacci(int n){
        if(n==1){
            return 1;
        }else  if(n==2){
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }


   }

    public static void main(String[] args) {
       Recursion recursion=new Recursion();
      System.out.println(recursion.recursion(1));
    }

}
