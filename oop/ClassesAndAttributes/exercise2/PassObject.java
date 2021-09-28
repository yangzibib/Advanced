package exercise2;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class PassObject {
    public PassObject() {
    }

    public void printAreas(Circle c, int times){

        for(int i=1;i<=times;i++){
          double Area= c.findArea(i);
          System.out.println(i+"            "+Area);
        }
    }
}
