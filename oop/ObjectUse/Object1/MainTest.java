package Object1;

import org.junit.Test;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 21:03
 */
public class MainTest {
    EqualsTest equalsTest=new EqualsTest();
    EqualsTest equalsTest1=new EqualsTest();
    @Test
    public void m(){
        EqualsTest.main(new String[]{"aa","bb","cc"});
        System.out.println(equalsTest.equals(equalsTest));
        System.out.println(equalsTest.equals(equalsTest1));
        String s1=new String("qwertyuiop");
       // s1=;
        String s2=new String("qwertyuiop");
      //  s2="qwertyuiop";
        System.out.println(s1.equals(s2));
     //   System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(equalsTest);
    }


}
