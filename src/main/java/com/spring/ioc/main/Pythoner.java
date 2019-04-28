package com.spring.ioc.main;

public class Pythoner implements Coder {
    private String name;

    public Pythoner(String name){
        this.name = name;
    }
    @Override
    public void WriteCode() {
        System.out.println(this.name + "writing python code");
    }
}
