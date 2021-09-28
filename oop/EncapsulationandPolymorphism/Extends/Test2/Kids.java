package Extends.Test2;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/28 18:21
 */
public class Kids extends ManKind {
    int yearsOld;

//    public Kids(int sex, int salary, int yearsOld) {
//        super(sex, salary);
//        this.yearsOld = yearsOld;
//    }
    public Kids(int yearsOld){
//        super();
        this.yearsOld=yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }


}
