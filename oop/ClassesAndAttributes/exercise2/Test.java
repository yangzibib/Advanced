package exercise2;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Radius"+"           "+"Area");
        Circle circle=new Circle();
        PassObject passObject=new PassObject();
        passObject.printAreas(circle,5);
    }
}
