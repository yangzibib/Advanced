package Constructor.ThisUse;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class Person {
    String name;
    int age;
    int sex;
    static int id;
    public void setName(String name){
        this.name=name;
    }
    public void setAgeId(int age,int id){
        this.age=age;
        this.id=id;
    }
    public String getName(String name){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

}
