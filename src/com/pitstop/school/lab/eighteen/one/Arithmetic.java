//Kyle Pittman 4/1/2015.
package com.pitstop.school.lab.eighteen.one;

public class Arithmetic

{

    public static int gcd(int a, int b)

    {
        if(!(a == 0 || b == 0)){
            if(a >= b){
                System.out.println(a + ", " + b);
                return gcd(a % b, b);
            }
            else{
                System.out.println(a + ", " + b);
                return gcd(a,b % a);
            }
        }
        else{
            if(a > b) return a;
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 160));
    }
}
