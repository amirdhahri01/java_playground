package com.mycompany.dev_application;


public class DumbClass2 extends Thread{
    String nom = "toto";
    int maxv = 100;
    public DumbClass2(String nom){
        this.nom = nom;
    }
    @Override
    public void run(){
        System.out.format("Ici le thread %s, je debute \n" , nom);
        for(int i = 0 ; i < maxv ;i++){
            System.out.format("[%s] dit je suis ici %d\n" , nom , i);
        }
        System.out.format("Ici le thread %s, je termine! \n" , nom);
    }
    public static void main(String[] args){
        try{
            String jobName = String.format("Job %d",0);
            DumbClass2 objetExec = new DumbClass2(jobName);
            System.out.format("Creating thread %s\n" ,jobName );
            objetExec.start();
            System.out.format("Thread principal terminé !\n");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
