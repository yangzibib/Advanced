/**
 * @Author Yangzibin
 * @Date 2021/9/25
 */
public  class TestClass {
    public static void main(String[] argsTest) {
        Users yang=new Users(1,"yangzibinq","15037753749",24,true,"yzb1999709");
        yang.LogIn(12, "123");
        System.out.println(yang.age);

        Users zi=new Users();
        zi.LogIn(12, "123");
        System.out.println(zi.id);

        Users bin =new Users("yangzibinq","15037753749",24,true,"yzb1999709");
        yang.LogIn(12, "123");
        System.out.println(bin.id);
        System.out.println(Users.name);


        Users y=new Users();
        y.setName("ya");
       String a=y.getName();
        System.out.println(a);


    }



}
class Users {

   final static int id=100;
   static String name="y";
   String telephone;
   int age;
   boolean gender;
   String password;

    public Users() {
    }

    public Users(int id, String name, String telephone, int age, boolean gender, String password)
     {
        this.name = name;
        this.telephone = telephone;
        this.age = age;
        this.gender = gender;
        this.password = password;
    }

    public Users(String name, String telephone, int age, boolean gender, String password) {

        this.name = name;
        this.telephone = telephone;
        this.age = age;
        this.gender = gender;
        this.password = password;

    }


    public void LogIn(int id, String password)
   {   System.out.println();
       System.out.println("账号:"+id);
       System.out.println("密码:"+password);

   }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        Users.name = name;
    }
}



