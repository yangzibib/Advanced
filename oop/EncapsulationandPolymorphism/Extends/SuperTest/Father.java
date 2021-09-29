package Extends.SuperTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 12:32
 */
public class Father {
    static int age=10;
    String id;
    String name="老杨";
    double account=16124;
   // int sex=1;

    public Father() {
        System.out.println("调用了老杨的无参构造函数");
    }

    public Father(String id, String name) {
        this();
        this.id = id;
        this.name = name;
        System.out.println("调用了老杨的id和name的构造函数");
    }

    public Father(String id, String name, double account) {

        this(id,name);
        this.account = account;
        System.out.println("调用了老杨的全参构造函数");
    }

    public void run(){
        System.out.println("老杨能跑500m");
    }
    public void job(){

    }
}
