package Constructor.ThisUse;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAgeId(18,1);
        System.out.println(person.getId());
    }
}
