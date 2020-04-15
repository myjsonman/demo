package com.kavy.demo.designcase;
//恶汉式
public class SingletoEvil {
    public static void main(String[] args) {
        SingletoLazy instace1 = SingletoLazy.getInstace();
        SingletoLazy instace2 = SingletoLazy.getInstace();
        System.out.println(instace1 != instace2);
    }

    private static SingletoEvil instace =new SingletoEvil();
    private SingletoEvil(){}
    public static SingletoEvil getInstace(){
        return instace;
    }

}
