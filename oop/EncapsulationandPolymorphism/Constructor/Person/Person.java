package Constructor.Person;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class Person {
    int age;
    String name;



    public Person() {
        age=18;
    }

    public Person(int inputAge) {
        age =inputAge ;
    }

    public Person(String inputName) {
        name = inputName;
    }

    public Person(int inputAge, String inputName) {
        age = inputAge;
        name = inputName;
    }
    public void set(int age,String name){
        age=age;
        name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}
