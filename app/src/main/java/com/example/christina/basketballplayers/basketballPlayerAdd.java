package com.example.christina.basketballplayers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class basketballPlayerAdd extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_player_add);
    }

    public void enterPlayerPressed(View v)
    {
        EditText nameET = this.findViewById(R.id.nameET);
        EditText jerseyNumberET = this.findViewById(R.id.jerseyNumberET);
        EditText ageET = this.findViewById(R.id.ageET);
        EditText heightFeetET = this.findViewById(R.id.heightFeetET);
        EditText heightInchET = this.findViewById(R.id.heightInchET);

        String name = nameET.getText().toString();
        int jerseyNumber = Integer.parseInt(jerseyNumberET.getText().toString());
        int age = Integer.parseInt(ageET.getText().toString());
        int heightFeet = Integer.parseInt(heightFeetET.getText().toString());
        int heightInch = Integer.parseInt(heightInchET.getText().toString());

        basketballPlayers bp = new basketballPlayers(name, jerseyNumber, age, heightFeet, heightInch);
        Core.addBasketballPlayer(bp);
        this.finish();
    }
}
