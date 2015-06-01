//Kyle Pittman 5/23/2015.
package com.pitstop.learning.test.GetClassLocation;


import java.util.logging.Logger;

public class GetterClass {
    public GetterClass(){

    }

    public String getClassPath(Class c1){
        return c1.getName().replace('.','/');
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        GetterClass getter = new GetterClass();
        System.out.println(test.getClass());
    }
}
