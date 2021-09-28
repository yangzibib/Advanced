package exercise2;

/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public class Circle {

    public Circle() {

    }

    double radius;
    public double findArea(int radius){
        this.radius=radius;
        return Math.PI*radius*this.radius;
    }
}
