package Extends.SuperTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 12:32
 */
public class GrandSon extends son{
    String name="小小杨";
    int sex=3;

    public GrandSon() {
        super();

    }

    public void GradSonTest(){
        System.out.println(sex);
        System.out.println(this.sex);
        System.out.println(super.sex);
        System.out.println(super.sex);
    }
}
