//Kyle Pittman 10/31/2014.
package com.pitstop.school.codingBat.string2;

public class sameStarChar {
    public boolean sameStar(String str) {
        boolean same = true;
        char left, inner, right, stored;
        boolean innerStar = false;

        if (str.length() > 2) {
            left = str.charAt(0);
            inner = str.charAt(1);

            for (int count = 2; count < str.length(); count++) {
                right = str.charAt(count);
                if (inner == '*' && left != right) same = false;
                left = inner;
                inner = right;
            }
        }
        return same;
    }
}
