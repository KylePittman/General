package com.pitstop.school.lab.eleven.one;

/**
 * Created by Kyle on 2/18/2015.
 */
public class Dog implements Speakable

{

    private String name;

    public Dog(String name)

    {

        this.name = name;

    }

    public void speak()

    {

        System.out.println("Woof! Woof!");

    }

    public String toString()

    {

        return "Dog: " + name;

    }

}
