package Constructor.ThisInconstructor;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class UserTest {
    public static void main(String[] args) {
        User user=new User(1,"Yangzibin",18);
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getAge());



    }
}
