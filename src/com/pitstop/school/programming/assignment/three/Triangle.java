//Kyle Pittman 10/20/2014.
package com.pitstop.school.programming.assignment.three;

public class Triangle {
    private double[] side = new double[3];

    public Triangle(){
        side[0] = 1;
        side[1] = 1;
        side[2] = 1;
    }
    public Triangle(double one, double two, double three){
        side[0] = one;
        side[1] = two;
        side[2] = three;
    }



    public boolean isRight(){
        boolean isItRight = false;
        if(side[0] > side[1] && side[0] > side[2] && Math.pow(side[1],2)+ Math.pow(side[2],2) == Math.pow(side[0],2)) isItRight = true;
        if(side[1] > side[0] && side[1] > side[2] && Math.pow(side[0],2)+ Math.pow(side[2],2) == Math.pow(side[1],2)) isItRight = true;
        if(side[2] > side[1] && side[2] > side[0] && Math.pow(side[1],2)+ Math.pow(side[0],2) == Math.pow(side[2],2)) isItRight = true;
        return isItRight;
    }

    public boolean isScalene(){
        boolean isItScalene = false;
        if (!(side[0] == side[1] || side[1] == side[2])) isItScalene = true;
        return isItScalene;
    }
    public boolean isEquilateral(){
        boolean isItEquilateral = false;
        if (side[0] == side[1] && side[1] == side[2]) isItEquilateral = true;
        return isItEquilateral;
    }
    public boolean isIsosceles(){
        boolean isItIsosceles = false;
        if (!(this.isEquilateral() || this.isScalene())) isItIsosceles = true;
        return isItIsosceles;
    }
    public void getInfo(){
        System.out.println("Sides: " + side[0] + ", " + side[1] + ", " + side[2]);
        System.out.println("This triangle is right: " + this.isRight());
        System.out.println("This triangle is scalene: " + this.isScalene());
        System.out.println("This triangle is isosceles: " + this.isIsosceles());
        System.out.println("This triangle is equilateral: " + this.isEquilateral());
    }



    /******************* output ******************************
     Enter first side of triangle: 12
     Enter second side of triangle: 14
     Enter third side of triangle: 12
     This triangle is not a right triangle
     This triangle is not a scalene triangle
     This triangle is an isosceles triangle
     This triangle is not an equilateral triangle
     *********************************************************/
}
