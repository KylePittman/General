//Michaela Dinman
import java.util.Random;
import java.util.Scanner;
public class HighLow
{
    public static void main(String[] args)
    {
        System.out.print("Would you like to (G)uess the number or (T)hink of the number? G/T: ");

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int numberofguesses = 0;
        int bottom = 0;
        int top = 101;
        int compgues = 50;
        int save;

        //Guessing
        while (word.equals("g") || word.equals("G"))
        {
            Random die = new Random();
            int ans = die.nextInt(101);
            numberofguesses = 0;

            System.out.println("Okay, you'll guess the number!\n");
            System.out.print("Enter Guess: ");
            int gues = scan.nextInt();
            System.out.println("You guessed " + gues);

            while (gues > ans || gues < ans)
            {
                if (gues < 0)
                {
                    System.out.println(gues + " is out of bounds (too small). Please try a number between 0 and 100.\n");
                    System.out.print("What is your next guess? ");
                    gues = scan.nextInt();
                }
                else if (gues > 100)
                {
                    System.out.println(gues + " is out of bounds (too big). Please try a number between 0 and 100.\n");
                    System.out.print("What is your next guess? ");
                    gues = scan.nextInt();
                }
                else if (gues > ans)
                {
                    System.out.println(gues + " is too big, please try again.\n");
                    System.out.print("What is your next guess? ");
                    gues = scan.nextInt();
                    System.out.println("You guessed " + gues);
                    numberofguesses++;
                }
                else if (gues < ans)
                {
                    System.out.println(gues + " is too small, please try again.\n");
                    System.out.print("What is your next guess? ");
                    gues = scan.nextInt();
                    System.out.println("You guessed " + gues);
                    numberofguesses++;
                }
            }
            if (gues == ans)
            {
                System.out.println("Correct! :)");
                numberofguesses++;
                System.out.println("You guessed " + numberofguesses + " times.\n");
                System.out.print("Would you like to play again? Y/N: ");
                String next = scan.next();
                if (next.equals("y") || next.equals("Y"))
                {
                    System.out.print("Would you like to (G)uess the number or (T)hink of the number? G/T: ");
                    word = scan.next();
                }
                else if (next.equals("n") || next.equals("N"))
                {
                    System.out.println("Okay, thank you for playing!");
                    word = "bbb";
                }
            }
        }

        //Thinking
        while (word.equals("t") || word.equals("T"))
        {
            System.out.println("Okay, you'll think of the number!\n");
            System.out.println("Is your number 50?");
            System.out.print("Is the computer's guess too (B)ig or too (S)mall or (C)orrect? B/S/C: ");
            String compans = scan.next();
            numberofguesses = 0;
            compgues = 50;
            top = 101;
            bottom = 0;

            while (compans.equals("b") || compans.equals("B") || compans.equals("s") || compans.equals("S"))
            {
                if (compans.equals("b") || compans.equals("B"))
                {
                    top = compgues;
                    save = (top - bottom) / 2;
                    compgues = save + bottom;
                    System.out.println("\nIs your number " + compgues + "?");
                    System.out.print("Is the computer's guess too (B)ig or too (S)mall or (C)orrect? B/S/C: ");
                    compans = scan.next();
                    numberofguesses++;
                }
                if (compans.equals("s") || compans.equals("S"))
                {
                    bottom = compgues;
                    save = (top - bottom) / 2;
                    compgues = save + bottom;
                    System.out.println("\nIs your number " + compgues + "?");
                    System.out.print("Is the computer's guess too (B)ig or too (S)mall or (C)orrect? B/S/C: ");
                    compans = scan.next();
                    numberofguesses++;
                }
            }
            if (compans.equals("c") || compans.equals("C"))
            {
                System.out.println("Yay! I guessed it!");
                System.out.println("It took me " + numberofguesses + " tries to get it right.\n");
                System.out.print("Would you like to play again? Y/N: ");
                String next = scan.next();
                if (next.equals("y") || next.equals("Y"))
                {
                    System.out.print("Would you like to (G)uess the number or (T)hink of the number? G/T: ");
                    word = scan.next();
                }
                else if (next.equals("n") || next.equals("N"))
                {
                    System.out.println("Okay, thank you for playing!");
                    word = "bbb";
                }
            }
        }
    }
}