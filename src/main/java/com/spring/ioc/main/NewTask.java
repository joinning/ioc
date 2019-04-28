package com.spring.ioc.main;

public class NewTask {

    private String name;
//    private Javaer javaer;

    private Coder coder;
    /*
        依赖注入的常见方法
        1、通过setter注入
        2、通过构造方法注入
        3、配置文件注入（要求注入的对象稳定性非常高，）

         //通过构造方法注入
          public NewTask(String name, Javaer javaer) {
              this.name = name;
              this.javaer = javaer; //构造方法中进行注入
          }

          //通过setter注入
          public void setJavaer(Javaer javaer){
              this.javaer = javaer;
          }
     */
    public NewTask(String name){
        this.name = name;
    }

    public void setCoder(Coder coder){
        this.coder = coder;
    }

    public void Start() {
        System.out.println(this.name + " started ..");
        this.coder.WriteCode();
    }
}
