package Extends.Test1;

import Extends.StudentTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 17:29
 */
public class StudnetTest {
    public static void main(String[] args) {
        StudentTest studentTest=new StudentTest();
        Student student=new Student("Yang",'m',18);
        System.out.println(student.toString());
        System.out.println( studentTest.toString());


        Person person=new Person("Yang",(char)113,18);
        System.out.println(person.toString());

    }
}
