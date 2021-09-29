package Polymorphism;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 14:53
 */
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.PolyTest(new Man());
        test.PolyTest(new Woman());
        test.PolyTest(new Person());


    }
    public void PolyTest(Person person){
        person.eat();

    }
}
