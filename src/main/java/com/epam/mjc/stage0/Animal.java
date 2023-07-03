package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }
    public String getDescription(){
        String hasFurString;
        if(hasFur==true){
            hasFurString="a";
        }
        else {
            hasFurString="no";
        }
        if(numberOfPaws!=1) {
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and "+hasFurString+" fur.";
        }
        else {
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and "+hasFurString+" fur.";
        }
    }
    public static void main(String[] args) {
        Animal animal=new Animal("blue", 1213, false);
        System.out.println(animal.getDescription());
    }
}
