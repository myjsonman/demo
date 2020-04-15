package com.kavy.demo.designcase;

public class SingletoSynchronized {
    private static SingletoSynchronized instace;
    private SingletoSynchronized(){}
    public static synchronized SingletoSynchronized getInstance(){
        if (instace==null){
            instace = new SingletoSynchronized();
        }
        return instace;
    }
}
