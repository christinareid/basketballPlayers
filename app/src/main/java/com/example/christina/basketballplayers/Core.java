package com.example.christina.basketballplayers;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Core
{
    public static basketballPlayers[] thePlayers = new basketballPlayers[1000];
    public static String[] theBasketballPlayers = new String[1000];
    private static int numberOfPlayers = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference("basketballPlayers");
    public static basketballPlayersArrayAdapter aa;

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener bpListener = new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                // Get Post object and use the values to update the UI
                System.out.println("***" + dataSnapshot.getValue());

                Core.numberOfPlayers = 0;
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    basketballPlayers bp = ds.getValue(basketballPlayers.class);

                }
                Core.aa.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                // Getting Post failed, log a message
                System.out.println("loadPost:onCancelled " + databaseError.toException());
            }
        };
        Core.myRef.addValueEventListener(bpListener);
    }

    public static void writeBasketballPlayersToFirebase(basketballPlayers bp)
    {

        Core.myRef.push().setValue(bp);
    }

    public static void addBasketballPlayerLocal(basketballPlayers bp)
    {
        //encapsulated the logic of adding patient records here
        Core.thePlayers[Core.numberOfPlayers] = bp;
        Core.theBasketballPlayers[Core.numberOfPlayers] = bp.toString();
        Core.numberOfPlayers++;
        Core.writeBasketballPlayersToFirebase(bp);
    }
}
