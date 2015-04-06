//Marcus Silcox
package com.cousCous.school.lab.eighteenOne;


    public class PermutationCounter

    {
        private long n;

        public PermutationCounter(long numberOfItems)
        {
            n = numberOfItems;
        }

        public long getCount()
        {
           long toPrint = 1;
            for (int i = 1; i<= n; i++)
            {
                toPrint = toPrint * i;
            }
            return toPrint;
        }
        public long getCount1()
        {
            long toPrint = 1;
            if(n>0) {
                return new PermutationCounter(n *(n-1)).getCount1();
            }
            return toPrint;
        }

    }


