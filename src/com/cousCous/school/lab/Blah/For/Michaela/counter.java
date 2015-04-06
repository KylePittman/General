//Marcus Silcox
package com.cousCous.school.lab.Blah.For.Michaela;

public class counter {

    public counter()
    {

    }

    public int counter1(int A)
    {
        //A=2
        if(A>0)
        {
            System.out.println(A);
            counter1(A/2);
            System.out.println("blah");
            System.out.println(A);

        }
            return 0;
    }
}
