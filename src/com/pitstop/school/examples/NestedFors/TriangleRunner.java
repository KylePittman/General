package com.pitstop.school.examples.NestedFors;

/**
 This program prints two triangles.
 */


public class TriangleRunner
{
    public static void main(String[] args)
    {
        Triangle small = new Triangle(3);
        System.out.println(small.toString());

        Triangle large = new Triangle(45);
        System.out.println(large);
    }
}
