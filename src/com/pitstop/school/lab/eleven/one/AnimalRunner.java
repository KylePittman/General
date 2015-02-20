package com.pitstop.school.lab.eleven.one;

/**
 * Created by Kyle on 2/18/2015.
 */
import java.util.*;

public class AnimalRunner

{

    public static void main(String[] args)

    {
        /*Dog d1 = new Dog("Fred");
        d1.speak();
        Object obj = new Dog("Connie");

        Dog d2 = (Dog) obj;
        d2.speak();*/

        Dog d1 = new Dog("Fred");
        d1.speak();
        Object obj = new Dog("Connie");
        Dog d2 = (Dog) obj;
        d2.speak();


    }
}
