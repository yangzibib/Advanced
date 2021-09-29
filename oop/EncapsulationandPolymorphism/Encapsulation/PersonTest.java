package Encapsulation;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(-1);
        person.getAge();
        person.setAge(129);
        person.getAge();
        person.setAge(130);
        person.getAge();
        person.setAge(131);
        person.getAge();



    }
}
