package com.kavy.demo.designcase;
//懒汉式
public class SingletoLazy {
    public static void main(String[] args) {

        SingletoLazy instace1 = SingletoLazy.getInstace();
        SingletoLazy instace2 = SingletoLazy.getInstace();
        System.out.println(instace1 == instace2);
    }
    //创建instace存Singleto
    private static SingletoLazy instace ;
    //私有构造方法
    private SingletoLazy(){}

    //多线程安全加锁
    public static synchronized SingletoLazy getInstace(){
        if (instace==null){
            //创建一个Singleto对象
            instace = new SingletoLazy();
        }
        return instace;

    }

}
