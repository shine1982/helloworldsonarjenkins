package com.feng;

public class Hello {

    public String sayHi(String name){
        if (name != null)
            return "hello "+ name;

        return "hello world";
    }

    public String hi(boolean ok){
        return "not right";
    }
}
