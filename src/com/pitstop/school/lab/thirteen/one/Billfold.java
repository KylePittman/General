//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

public class Billfold {

    private Card[] cards = {null, null};

    public Billfold(){

    }

    public void add(Card c){
        if(cards[0] == null) cards[0] = c;
        else if(cards[1] == null) cards[1] = c;
        else return;
    }
    public String format(){
        String output = "[";
        if(cards[0] != null) output = output + cards[0].format();
        output = output + " | ";
        if(cards[1] != null) output = output + cards[1].format();
        output += "]";
        return output;
    }

    //public int
}
