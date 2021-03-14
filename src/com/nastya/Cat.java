package com.nastya;

public class Cat extends Animals {
    protected static int catCount=0;
    public Cat ( String name ) {
        super ( name );
        catCount++;

    }
    public void run(int distance){
        if (distance<=200)
            System.out.println ("Кошка " +name +" бежит" );
        else System.out.println ("Кошка " +name+" не может столько пробежать. Она не побежала, чтобы не сдохнуть" );

    }
    public void swim(int distance){
        System.out.println ("Кошка " +name+" не может плавать" );

    }
}
