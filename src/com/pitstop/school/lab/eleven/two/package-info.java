/**
 * Created by Kyle on 3/2/2015.
 */
package com.pitstop.school.lab.eleven.two;
/*
AP Computer Science Assigned:
        February 18, 2015
        Chapter 11 Interfaces ­ Lab # 2 Due:
        March 3, 2015
        1.1. Consider the following program that sorts Rectangleobjects:
public class SortDemo
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(10, 20, 30, 15);
        Rectangle rect3 = new Rectangle(20, 30, 45, 10);
// Put the rectangles into a list
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        list.add(rect1);
        list.add(rect2);
        list.add(rect3);
// Call the library sort method
        Collections.sort(list);
// Print out the sorted list
        for (int i = 0; i < list.size(); i++)
        {
            Rectangle r = list.get(i);
            System.out.println(r.getWidth() + " " +
                    r.getHeight());
        }
    }
}
When you compile the program, you will get an error message. What is the error message?
        What is the reason for the error message?

        1.2. Unfortunately, you cannot modify the Rectangle class so that it implements the
        Comparable interface. The Rectangle class is part of the standard library, and you cannot
        modify library classes.
        Fortunately, there is a second sort method that you can use to sort a list of objects of any
class, even if the class doesn't implement the Comparable interface.
        Comparator<T> comp = . . .;
        Collections.sort(list, comp);
        Comparator is an interface. Therefore, comp must be constructed as an object of some class
        that implements the Comparator interface.
        What method(s) must that class implement? (Hint: Look up the Comparator interface in the
// for example, Comparator<Rectangle> comp = new RectangleComparator();
        API documentation.)

        1.3. Implement a class RectangleComparator whose compare method compares two
        rectangles.
        The method should return:
        a positive integer if the area of the first rectangle is larger than the area of the
        second rectangle
        a negative integer if the area of the first rectangle is smaller than the area of the
        second rectangle
        0 if the two rectangles have the same area
        Part of the code has been provided for you below:
        import java.util.Comparator;
        import java.awt.Rectangle;
public class RectangleComparator implements Comparator<Rectangle>
{
    /**
     area of
     rectangle is
     two
     */
/*
    public int compare(Rectangle r1, Rectangle r2)
    {
    }
}
Compares two Rectangle objects.
@param r1 the first rectangle
@param r2 the second rectangle
        @return 1 if the area of the first rectangle is larger than the
        the second rectangle, ­1 if the area of the first
        smaller than the area of the second rectangle or 0 if the
        rectangles have the same area
        . . .

        1.4. Write a test program that adds the three rectangles below to a list, constructs a
        rectangle comparator, sorts the list, and prints the sorted list and the expected values.
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(10, 20, 30, 15);
        Rectangle rect3 = new Rectangle(20, 30, 45, 10);
        What is your test program?

        1.5. A very specialized class, such as the RectangleComparator, can be defined inside the
        method that uses it.
        Reorganize your program so that the RectangleComparator class is defined inside the
        main method of your test class.
        What is your main method now?
        1
*/