package com.company;

public class Dog extends Animal{
    void bark() {
        System.out.println("barking");
    }
    public static void main(String args[]) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
