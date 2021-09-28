package EncapsulationTest;

import Encapsulation.Person;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class Father extends Person {
   String WifeName;

   //Father father=new Father();

   public Father() {
      System.out.println("进入了father的构造函数");
   }

   public void setTelephone(String inputTelephonr){
      this.telephone=""+inputTelephonr;
   }
   public String getTelephone(){
      return this.telephone;
   }
   void show (){
      System.out.println(""+this.getTelephone());
   }



}
