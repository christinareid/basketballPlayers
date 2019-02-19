package com.example.christina.basketballplayers;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.firebase.database.*;

public class MainActivity extends AppCompatActivity
{
    private ListView lv;
    private basketballPlayersArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for(int i =0; i < Core.theBasketballPlayers.length; i++)
        {
            Core.theBasketballPlayers[i] = new basketballPlayers().toString();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.aa = new basketballPlayersArrayAdapter(this, R.layout.list_view_row_advanced, Core.thePlayers);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(aa);
    }

    public void enterPlayerPressed(View v)
    {
        Intent i = new Intent(this, basketballPlayerAdd.class);
        this.startActivity(i);
    }
}
