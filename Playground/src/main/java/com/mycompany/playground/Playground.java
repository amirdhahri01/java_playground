package com.mycompany.playground;

public class Playground {
    public static void excute(sayGood sayhello){
        sayhello.sayGood();
    }
    public static void main(String[] args) {
        excute(() -> {
               System.out.println("Hello World!");
        });
    }
}

interface sayGood {
    public void sayGood();
}