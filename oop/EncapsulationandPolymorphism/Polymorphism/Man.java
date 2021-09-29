package Polymorphism;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 14:53
 */
public class Man extends Person{
    String muscle;
    String beards;

    @Override
    public void eat() {
        System.out.println("男人吃得多");
    }
    public void eat(String a){
        System.out.println(a);
    }
}
