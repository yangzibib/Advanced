package Extends.SuperTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 12:43
 */
public class SuperTest {
    public static void main(String[] args) {
        son son=new son("小杨","优秀");
        son.Test();
        son.run();
        GrandSon grandSon=new GrandSon();
        grandSon.GradSonTest();


    }
}
