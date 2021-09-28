package PassByValue;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class SwapTest {
    public static void main(String[] args) {
        Swap sp1=new Swap();
        sp1.swap1(sp1);

        System.out.println("_________________________");
        Swap sp2=new Swap();
        sp2.swap2(1,20);


    }
}
