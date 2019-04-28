package com.spring.ioc.main;

public class NewTask {

    private String name;
    private Javaer javaer;

    /*
        依赖注入的两种常见方法
        1、通过setter注入
        2、通过构造方法注入
     */
    public NewTask(String name){
        this.name = name;
    }

    //通过构造方法注入
    public NewTask(String name, Javaer javaer) {
        this.name = name;
        this.javaer = javaer; //构造方法中进行注入
    }

    //通过setter注入
    public void setJavaer(Javaer javaer){
        this.javaer = javaer;
    }

    public void Start() {
        System.out.println(this.name + " started ..");
        this.javaer.WriteCode();
    }
}
