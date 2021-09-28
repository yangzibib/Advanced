package Extends.Test2;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 18:21
 */
public class ManKind {
    int sex;
    int salary;

//    public ManKind(int sex, int salary) {
//        this.sex = sex;
//        this.salary = salary;
//    }
    public ManKind(){
        System.out.println("ManKind的构造函数");
    }

    public void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("woman");
        }else {
            System.out.println("人妖");
        }
    }
    public void employed(){
        if (salary==0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }

}
