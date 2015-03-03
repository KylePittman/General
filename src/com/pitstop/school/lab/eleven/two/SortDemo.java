//Kyle Pittman 2/20/2015.
package com.pitstop.school.lab.eleven.two;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args)

    {
        class RectangleComparator implements Comparator<Rectangle>
        {
            /**
             Compares two Rectangle objects.
             @param r1 the first rectangle
             @param r2 the second rectangle
             @return 1 if the area of the first rectangle is larger than the
             area of
             rectangle is
             two
             */
            public int compare(Rectangle r1, Rectangle r2)
            {
                if(r1.getHeight()*r1.getWidth() > r2.getWidth()*r2.getHeight()) return 1;
                else if(r1.getHeight()*r1.getWidth() < r2.getWidth()*r2.getHeight()) return -1;
                else return 0;
            }
        }
        RectangleComparator comparator = new RectangleComparator();
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(10, 20, 30, 15);
        Rectangle rect3 = new Rectangle(20, 30, 45, 10);
// Put the rectangles into a list
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        list.add(rect1);
        list.add(rect2);
        list.add(rect3);

// Call the library sort method
        Collections.sort(list, comparator);
// Print out the sorted list

        for (int i = 0; i < list.size(); i++)
        {
            Rectangle r = list.get(i);
            System.out.println(r.getWidth() + " " +
                    r.getHeight());
        }
    }
}
