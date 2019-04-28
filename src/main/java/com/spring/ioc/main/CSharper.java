package com.spring.ioc.main;

public class CSharper implements Coder {
    private String name;

    public CSharper(String name){
        this.name = name;
    }
    @Override
    public void WriteCode() {
        System.out.println(this.name + "writing c# code...");
    }
}
