package com.nastya;

public class Main {

    public static void main(String[] args) {
    Competition competition= new Competition ( 10,500 );
    Cat[] cats = new Cat[2];
    Dog[] dogs = new Dog[2];
	cats[0] = new Cat ( "Барсик" );
	dogs[0] = new Dog ( "Шарик" );
	cats[1] = new Cat ( "Васька" );
	dogs[1] = new Dog ( "Тузик" );
        for ( Cat cat : cats ) {
            cat.swim ( competition.sweemDistance );
            cat.run ( competition.runDistance );
        }
        for (Dog dog : dogs) {
            dog.swim ( competition.sweemDistance );
            dog.run ( competition.runDistance );
        }
        System.out.println (Animals.animalCount );
        System.out.println (Dog.dogCount );
        System.out.println (Cat.catCount );

    }

}

