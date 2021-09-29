package Extends.Test1;

import org.junit.Test;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 17:29
 */
public class StudentTest {
    StudentTest studentTest=new StudentTest();
    public static void main(String[] args) {

        Student student=new Student("Yang",'m',18);
        System.out.println(student.toString());
        //System.out.println( this.studentTest.toString());


        Person person=new Person("Yang",(char)113,18);
        System.out.println(person.toString());


    }
    @Test
    public void Test(){
        //studentTest.Test();

    }
}
