package EncapsulationTest;


import Encapsulation.Person;
import org.junit.Test;

import sun.rmi.runtime.Log;

import javax.accessibility.AccessibleContext;


/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class FatherTest extends Person {

    public static void main(String[] args) {
       Father father=new Father();
       father.setTelephone("15037753749");
       father.show();
       Constructor.MutAccount.Account account=new  Constructor.MutAccount.Account(2000);
       System.out.println(args.length);
       System.out.println(father);

    }
    @Test
    public void test(){
        FatherTest fatherTest=new FatherTest();
        String[] argsTest=new String[]{"aa"};
        FatherTest.main(argsTest);

    }


}
