package Encapsulation;

import Extends.StudentTest;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class Person {
    private int  age;
    public  String name;
    boolean sex;
    protected  static  String telephone;

    public Person() {
        System.out.println("进入了Person的构造函数");
    }

    void setAge(int inputAge){
        if(inputAge<=0){
            System.out.println("请重新输入年龄，年龄不能为:"+inputAge);
        }else if(inputAge>130) {
            System.out.println("请重新输入年龄，年龄不能为:"+inputAge);
        }else {
            age=inputAge;
            System.out.println("你的年龄是:"+age);
        }


    }
    int getAge(){
        return age;
    }
    protected void Test(){
        System.out.println("调用了ProtectTest方法");
    }

}
