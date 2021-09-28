package ThisUse2;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class Test {
    public static void main(String[] args) {
      Boy boy=new Boy("小明",19);
      Girl girl=new Girl("小红",18);
      girl.marry(boy);
      System.out.println(girl.compare(new Girl("小兰",19)));

    }
}
