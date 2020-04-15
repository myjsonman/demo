package com.kavy.demo.designcase;

public class SingletoClass {
    //内部类
   /* private static class SingletoFactory{
       private static final SingletoClass instace = new SingletoClass();
    }
    private SingletoClass(){}
    public static SingletoClass getInstance(){
        return SingletoFactory.instace;
    }*/

  private static class SingletoFactory{
      private static final SingletoClass instace = new SingletoClass();
  }
  private SingletoClass(){}
  public static SingletoClass getInstance(){
      return SingletoFactory.instace;
  }


}
