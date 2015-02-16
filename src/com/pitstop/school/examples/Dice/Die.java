//This class models a die that, when cast, lands on a random face.


package com.pitstop.school.examples.Dice;

import java.util.Random;

public class Die
{
    private Random generator;
    private int sides;

    // Constructs a die with a given number of sides.
    public Die(int s)
    {
        sides = s;
        generator = new Random();
    }

    //Simulates a throw of the die
    public int cast()
    {
        return 1 + generator.nextInt(sides);
    }
}
