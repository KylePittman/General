package com.pitstop.school.lab.eleven.one;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Kyle on 2/18/2015.
 */
public class SortingAccounts
{

    public static void main(String[] args) {
        // Put bank accounts into a list

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();

        list.add(new BankAccount(1500));

        list.add(new BankAccount(200));

        list.add(new BankAccount(50000));

// Call the library sort method

        Collections.sort(list);

// Print out the sorted list

        for (int i = 0; i < list.size(); i++)

        {

            BankAccount b = list.get(i);

            System.out.println(b.getBalance());

        }
    }
}
