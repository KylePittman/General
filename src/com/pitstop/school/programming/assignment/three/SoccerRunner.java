//Kyle Pittman 10/24/2014.
package com.pitstop.school.programming.assignment.three;

import java.io.IOException;

public class SoccerRunner{
    public static void main(String[] args) throws IOException{
        SoccerStandings Tigers = new SoccerStandings(0);
        SoccerStandings Cavaliers = new SoccerStandings(1);
        SoccerStandings Bears = new SoccerStandings(2);
        SoccerStandings Wolverines = new SoccerStandings(3);
        SoccerStandings Cobras = new SoccerStandings(4);



        SoccerStandings Donkeys = new SoccerStandings(5);
        SoccerStandings Giraffes = new SoccerStandings(6);
        SoccerStandings Eagles = new SoccerStandings(7);
        SoccerStandings Dolphins = new SoccerStandings(8);
        SoccerStandings BenchWarmers = new SoccerStandings(9);
        System.out.println("Wins  Losses  Ties  Goals Scored  Goals Allowed  Score");
        Tigers.getStats();
        Cavaliers.getStats();
        Bears.getStats();
        Wolverines.getStats();
        Cobras.getStats();
        Donkeys.getStats();
        Giraffes.getStats();
        Eagles.getStats();
        Dolphins.getStats();
        BenchWarmers.getStats();
    }
}
