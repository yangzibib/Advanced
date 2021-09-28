package Constructor.ThisInconstructor;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class User {
    private int id;
    private String name;
    private int age;
    private boolean sex;

    public User() {

    }
    public User(int id){
        this();
        this.id=id;
     }
    public User(int id,String name){
        this(id);
        this.name=name;

    }
    public User(int id,String name,int age){
      this(id,name);
      this.age=age;

    }
    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }

}
