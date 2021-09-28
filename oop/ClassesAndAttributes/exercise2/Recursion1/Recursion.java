package exercise2.Recursion1;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Recursion {

    /**
     *
     * @param n
     * @return 1到n的自然数之和
     */
    public int recursion(int n){
        if(n==1){
            return 1;
        }else {
//            int a=n;
//            int b= recursion(n-1);
//            int area=a+b;
            return n+recursion(n-1);
        }

    }
}
