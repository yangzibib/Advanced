package PassByValue;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Swap {

    int a=1;
    int b=2;

    public void swap1(Swap ss){

        System.out.println("a="+a+",b="+b);
        int temp=b;
        b=a;
        a=temp;


        System.out.println("a="+a+",b="+b);



    }
    public void swap2(int a,int b){

        System.out.println("a="+a+",b="+b);
        int temp=b;
        b=a;
        a=temp;


        System.out.println("a="+a+",b="+b);

    }
}

