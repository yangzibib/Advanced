package Extends.MethodOverRide;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 21:07
 */
public class StudentTest {
    /**
    * @Description
    * @param  * @param null
    * @return null
    * @auther Administrator_master
    * @date 2021/9/29 16:2
     * * 向下转型不能乱转，要先判断boolean inst0=father instanceof Student;
     * *                       boolean inst1=father1 instanceof Student;-----》a instanceof A  判断是否是A的一个实例。
    */
    public static void main(String[] args) {
        Student student=new Student();
       // student.see();
        Father father=new Student();
   //     father.study() //报错
        father.see();
        father.run();
        Father father1=new Father();
        System.out.println("-------------------------------------");
        boolean inst0=father instanceof Student;
        boolean inst1=father instanceof Father;

        boolean inst2=father1 instanceof Student;
        boolean inst3=father1 instanceof Father;
        Student student_father=(Student)father1;//Exception in thread "main" java.lang.ClassCastException:
        //System.out.println("-------------------------------------");
        student_father.see();
        student_father.study();
    }
}
