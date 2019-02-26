package com.example.christina.basketballplayers;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class basketballPlayersArrayAdapter extends ArrayAdapter
{
    private Context mContext;
    private basketballPlayers[] basketballPlayersList = new basketballPlayers[1000];
    private int textViewResourceId;

    public basketballPlayersArrayAdapter(Context context, int textViewResourceId, basketballPlayers[] list)
    {
        super(context, textViewResourceId, list);
        mContext = context;
        basketballPlayersList = list;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(this.textViewResourceId, parent, false);
        }

        basketballPlayers bp = this.basketballPlayersList[position];

        TextView nameTV = (TextView)listItem.findViewById(R.id.nameTV);
        TextView ageTV = (TextView)listItem.findViewById(R.id.ageTV);

        nameTV.setText(bp.getNameString());
        ageTV.setText("Hello World!" + position);


        return listItem;
    }

}
