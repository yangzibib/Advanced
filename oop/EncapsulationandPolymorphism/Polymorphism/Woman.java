package Polymorphism;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 14:53
 */
public class Woman extends Person{
    String Longhair;
    String beauty;

    @Override
    public void eat() {
        System.out.println("女人吃得少");
    }
}
