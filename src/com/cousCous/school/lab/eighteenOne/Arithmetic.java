//Marcus Silcox
package com.cousCous.school.lab.eighteenOne;

public class Arithmetic

{

    public Arithmetic() { }


    public int gcd(int a, int b)

    {
        if(!(a == 0 || b == 0)){
            if(a >= b){
                return gcd(a % b, b);
            }
            else{
                return gcd(a,b % a);
            }
        }
        else{
            if(a > b) return a;
            return b;
        }

    }

}
