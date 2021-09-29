package Extends;

import Encapsulation.Person;
import Extends.MethodOverRide.Father;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 22:18
 */
public class ProtectedTest extends Person {
    Father father=new Father();
    Person person=new Person();
    String tel=telephone;

    public static void main(String[] args) {
        ProtectedTest protectedTest=new ProtectedTest();
        String tel= protectedTest.telephone;
        protectedTest.Test();;
        Person person=new Person();

    }
    public void See(){
        Person person=new Person();

        this.telephone="18232r332y";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void Test() {
        super.Test();
    }
}
