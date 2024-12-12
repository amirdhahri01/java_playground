package com.mycompany.dev_application;

public class DumbClass implements Runnable{
    String nom = "toto";
    int maxItr = 100;
    public DumbClass(String nom){
        this.nom = nom;
    }

    @Override
    public void run() {
        System.out.format("Ici le thread %s, je debute \n" , nom);
        for(int i = 0 ; i < maxItr ;i++){
            System.out.format("[%s] dit je suis ici %d\n" , nom , i);
        }
        System.out.format("Ici le thread %s, je termine! \n" , nom);
    }
    
    public static void main(String[] args){
        try{
            String jobName = String.format("Job %d",0);
            DumbClass objetExec = new DumbClass(jobName);
            Thread job = new Thread(objetExec);
            System.out.format("Creating thread %s\n" ,jobName );
            job.start();
            System.out.format("Thread principal terminé !\n");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
