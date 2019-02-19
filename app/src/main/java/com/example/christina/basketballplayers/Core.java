package com.example.christina.basketballplayers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Core
{
    public static basketballPlayers[] thePlayers = new basketballPlayers[1000];
    public static String[] theBasketballPlayers = new String[1000];
    private static int numberOfPlayers = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();

    public static void writeBasketballPlayersToFirebase(basketballPlayers bp)
    {
        DatabaseReference myRef = database.getReference("players");
        myRef.push().setValue(bp);
    }

    public static void addBasketballPlayer(basketballPlayers bp)
    {
        //encapsulated the logic of adding patient records here
        Core.thePlayers[Core.numberOfPlayers] = bp;
        Core.theBasketballPlayers[Core.numberOfPlayers] = bp.toString();
        Core.numberOfPlayers++;
    }

}
