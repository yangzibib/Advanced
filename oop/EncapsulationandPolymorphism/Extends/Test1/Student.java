package Extends.Test1;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 17:25
 */
public class Student extends Person{
    long number;
    int math;
    int english;
    int computer;
   public  Student(String name,char sex,int age){
       super( name,sex,age);
   }
    public Student(String name,char sex,int age,long number,
                  int math,int english,int computer){
        super( name,sex,age);
        this.number=number;
        this.math=math;
        this.english=english;
        this.computer=computer;

    }
    public double aver(){
        double average=(math+english+computer)/3;
        return average;
    }
    public int max(){
        int max;
        if(math>=english)
        {max=math;}
        else{max=english;}


        return Math.max(max,computer);
    }
    public int min() {
        int min;
        if (math >= english) {
            min = english;
        } else {
            min = math;
        }


        return Math.max(min,computer);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
