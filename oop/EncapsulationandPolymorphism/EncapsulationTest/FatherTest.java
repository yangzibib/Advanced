package EncapsulationTest;

import Encapsulation.Person;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class FatherTest extends Person {
    public static void main(String[] args) {
       Father father=new Father();
       father.father.setTelephone("15037753749");
       father.father.show();
    }



}
