package CodeBlock;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/30 13:20
 */
public  class Animal extends Creature{
    int age;
    final String name;
    final float weight;

    static String id;

    public Animal() {
        super();
        System.out.println("Animal的构造函数");
    }

  static{

       country="China";
      //       TODO: 2021/9/30
      //        Animal.country="China";//无法将值赋给 final 变量 'country' 编译错误
        Animal.id="qjwj";
  //    System.out.println("动物的类属性实例化完成");
        System.out.println("Animal的静态代码块");
        System.out.println("----------------------");

    }
    final static String country;
//    {
//        System.out.println("Animal的非静态代码块");
//        System.out.println("----------------------");
//    }
    {this.age=10;
     this.name="Anim";
     this.weight=100f;

    // System.out.println("动物实例属性初始化完成");
      System.out.println("----------------------");
      System.out.println("Animal的非静态代码块");

    }
    public final  void Test(){
        System.out.println("Animal的Test方法");
    }
}
