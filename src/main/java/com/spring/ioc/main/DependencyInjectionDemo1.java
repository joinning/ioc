package com.spring.ioc.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DependencyInjectionDemo1 {

    private static String taskName; //任务
    private static String coderName; //语言
    private static String devName; //开发人员

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*现在我可以把这些写到配置文件中了*/
        taskName = "新任务名称";
        coderName = "Pythoner";
        devName = "小明";

        NewTask task = new NewTask(taskName);
        Coder coder = getCoder(coderName, devName);
        task.setCoder(coder);

        /* 以前这么写 */
        // task.SetCoder(new Pythoner("李四"));
        // task.SetCoder(new CSharper("王五"));

        task.Start();
    }

    /**
     * 根据类名获取类实例
     * @param coderName
     * @param name
     * @return 类的实例对象
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static Coder getCoder(String coderName, String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor c = Class.forName("com.spring.ioc.main."+coderName).getConstructor(String.class);
        Coder coder = (Coder)c.newInstance(new Object[] {name});
        return coder;
    }
    /*
     * 以上代码，实现了一个根据类名获取实例的getCoder方法，该方法有两个参数，一个是类名，
     * 另一个是Coder的构造参数name。在场景操作中，分别定义了任务名称，语言，开发人员三个变量，
     * 现在假设这些变量完全是从配置文件中读取的，那么，当我们以后增加新的语言，
     * 增加新的开发人员时，只需要新增加一个Coder接口的实现，然后修改配置文件即可。真正实现了OCP原则。
     */
}
