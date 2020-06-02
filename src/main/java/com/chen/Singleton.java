package com.chen;

public class Singleton {
    private static Singleton singleton=null;
    //避免在外部被实例化
    private Singleton(){};

    public static synchronized Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
        }else{
            System.out.println("已经被实例化了");
        }
        return singleton;
    }
}
