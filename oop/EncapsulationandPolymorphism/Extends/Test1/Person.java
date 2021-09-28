package Extends.Test1;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 17:24
 */
public class Person {
    String name;
    char sex;
    int age;

    @Override
    public String toString() {
        return super.toString();
    }

    public Person(String name, char sex, int age){
                this.name=name;
                this.age=age;
                this.sex=sex;

    }

}
