package com.mycompany.dev_application;

public class DumbClass3 {
   
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread job1 = new Thread(task1);
        Thread job2 = new Thread(task2);
        job1.start();
        job2.start();
        System.out.format("Ici le thread principal, je termine !\n");
    }
}

class Task1 implements Runnable{
    String th_nom = "toto";
    @Override
    public void run() {
        System.out.format("Ici le thread %s, je debute !\n" , th_nom);
        for(int i = 1 ; i <= 20 ; i++){
            System.out.format("[%d]\n " , i);     
        }
        System.out.format("Ici le thread %s, je termine !\n" , th_nom);
    }
}


class Task2 implements Runnable{
     String th_nom = "koko";

    @Override
    public void run() {
        System.out.format("Ici le thread %s, je debute !\n" , th_nom);
        for(int i = 20 ; i >= 1 ; i--){
            System.out.format("[%d]\n " , i);     
        }
        System.out.format("Ici le thread %s, je termine !\n" , th_nom);
    }
}