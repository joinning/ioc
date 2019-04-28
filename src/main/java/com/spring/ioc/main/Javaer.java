package com.spring.ioc.main;

public class Javaer implements Coder {
    private String name;

    public Javaer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void WriteCode() {
        System.out.println(this.name + " writting java code...");
    }
}
