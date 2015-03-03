package com.pitstop.school.lab.eleven.two;//Kyle Pittman 3/2/2015.

import java.util.Comparator;
import java.awt.Rectangle;
public class RectangleComparator implements Comparator<Rectangle>
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
