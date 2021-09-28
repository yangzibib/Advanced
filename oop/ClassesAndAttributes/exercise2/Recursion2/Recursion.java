package exercise2.Recursion2;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Recursion {
    /**
     *
     * @param n
     * @return f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),求f(10)?
     */
    public int recursion(int n){
        if(n==0){
            return 1;
        }else if (n==1){
            return 4;
        }else {
            return 2*recursion(n-1)+recursion(n-2);
        }

    }
}
