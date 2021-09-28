package Extends.MethodOverRide;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 21:07
 */
public class Father extends Person{
    private  String country;
    int eyes;
    int age;
    String wife;



    protected void see(){
        System.out.println("老婆");
    }
    public Father obj(){
         return this;
    }


}
