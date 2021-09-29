package Extends.SuperTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/29 12:32
 */
public class son extends Father{
    String name="小杨";
    String study;
    int sex=2;
    public void Test(){

    }
    public son(){
        super();
    }
    public son(String name,String study){
        //this();
        super("110","老老杨");
        System.out.println("调用了小杨的有参构造函数");


    }

    @Override
    public void run() {
        super.run();
        System.out.println("调用了小杨的run方法");    }
}
