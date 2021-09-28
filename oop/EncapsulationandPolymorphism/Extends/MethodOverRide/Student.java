package Extends.MethodOverRide;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 21:07
 */
public class Student extends Father{
    String number;
    double scores;

   @Override
    public void see() {
//        super.see();
        System.out.println("漂亮女同学");
    }

    @Override
    public Student obj() {
        return this;
    }
}
