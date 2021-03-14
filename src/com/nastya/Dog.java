package com.nastya;

public class Dog extends Animals{
    protected static int dogCount=0;
    public Dog ( String name ) {
        super ( name );
        dogCount++;
    }




    public void run(int distance){
        if (distance<=500)
            System.out.println ("Собака " +name +" бежит" );
        else System.out.println ("Собака " +name+" не может столько пробежать. Она не побежала, чтобы не сдохнуть" );

    }
    public void swim(int distance){
        if (distance<=10)
        System.out.println ("Собака " +name+" плывет" );
        else System.out.println ("Собака " +name+" не может столько проплыть. Она не поплыла, чтобы не утонуть" );

    }
}
