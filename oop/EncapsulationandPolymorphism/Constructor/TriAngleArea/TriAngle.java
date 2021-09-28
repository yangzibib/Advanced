package Constructor.TriAngleArea;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class TriAngle {
   private double base;
   private double height;

   private TriAngle(double inputBase, double inputHeight){
       base=inputBase;
       height=inputHeight;
   }

   /**
    *
    * @param ib inputBase
    * @param ih inputHeight
    *  静态方法
    */
   public static  void input(double ib,double ih){
      TriAngle triAngle=new TriAngle(ib,ih);
      System.out.println(triAngle.TriAngleArea());

   }


   public double TriAngleArea(){

      double Area;
      Area=(base*height)/2;
      return Area;
   }
}
