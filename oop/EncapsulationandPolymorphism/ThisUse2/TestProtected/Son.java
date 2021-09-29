package ThisUse2.TestProtected;

import Encapsulation.Person;
import Encapsulation.TT;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 17:32
 */
public class Son extends Person {
    Son son=new Son();
    Person person=new Person();
    TT tt=new TT();
    Object object=new Object();


    public static void main(String[] args) {


    }
    /**
    * @Description
    * @param  * @param null
    * @return null
    * @auther Administrator_master
    * @date 2021/9/29 19:47
     *
     * protected 需要从以下两个点来分析说明：
     *
     * 子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
     *
     * 子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
     *
     * protected 可以修饰数据成员，构造方法，方法成员，不能修饰类（内部类除外）。
    */
    public void Test(){

//        son.telephone
//        person.

    }
    public void Test1(){
//        tt.
//        object.
    }
}
