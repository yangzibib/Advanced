import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author Yangzibin
 * @Date 2021/9/25
 */
public class containsTest {
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};


    @Test
    public void test1()
    {
        Collection coll =new ArrayList();
        coll.add(123);
        coll.add("123");
        coll.add(new String("123"));
        coll.add(false);
        System.out.println(coll.contains(123));
        System.out.println(coll.contains("123"));
        System.out.println(coll.contains(new String("123")));
        System.out.println(coll.contains(new String("1234")));
    }
    @Test
    public void test2(){

//       Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
       System.out.println(DEFAULTCAPACITY_EMPTY_ELEMENTDATA);
        System.out.println("ee");
    }

}
