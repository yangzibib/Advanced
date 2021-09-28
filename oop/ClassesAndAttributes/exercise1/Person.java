package exercise1;



/**
 * @Author Yangzibin
 * @Date 2021/9/26
 */
public  class Person {
    String name;
    int age;
    boolean sex;
    public  void showAge(){

        System.out.println("age:"+age);

    }
    public void study(){

        System.out.println("studying");
        return;
    }

    /**
     *
     * @param step 加年龄的步长
     * @return this.age 该对象的年龄
     */

    public int addAge(int step){
       this.age=this.age+step;
       return this.age;
    }

    public String addAge(int step,int frequency  ){
        this.age=this.age+step*10;
        String myage;
        myage = String.valueOf(this.age);
        return myage;

    }

    public String VariableNumber(int...a){
//        a[0]=1;
//        a[1]=2;
        System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]);
        return String.valueOf(a[0]+a[1]);
    }
}

