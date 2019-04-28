package com.spring.ioc.main;

public class DependencyInjectionDemo {

    public static void main(String[] args) {
        /*
           通过setter进行注入
           NewTask task = new NewTask("开发微信支付宝收款明细获取工具");
           task.setJavaer(new Javaer("张三"));
           task.Start();
         */
        NewTask newTask = new NewTask("开发微信支付宝收款明细获取工具",new Javaer("甄硕"));
        newTask.Start();
    }
}
