package com.example.christina.basketballplayers;

public class Core
{
    private static basketballPlayers[] thePlayers = new basketballPlayers[1000];
    public static String[] theBasketballPlayers = new String[1000];
    private static int numberOfPlayers = 0;


    public static void addBasketballPlayer(basketballPlayers bp)
    {
        //encapsulated the logic of adding patient records here
        Core.thePlayers[Core.numberOfPlayers] = bp;
        Core.theBasketballPlayers[Core.numberOfPlayers] = bp.toString();
        Core.numberOfPlayers++;
    }

}
