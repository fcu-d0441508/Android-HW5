package com.example.user.nbaplayoffs;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 2017/5/2.
 */

public class NBAAdapter extends ArrayAdapter<NBAGame> {

    private Context context;

    public NBAAdapter(Context context, List objects) {
        super(context, 0, objects);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if (convertView == null) {
            itemlayout = (LinearLayout) inflater.inflate(R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        NBAGame game = (NBAGame) getItem(position);

        ImageView HostLogo = (ImageView) itemlayout.findViewById(R.id.imageView);
        HostLogo.setImageResource(game.hostLogo);

        TextView HostName = (TextView) itemlayout.findViewById(R.id.textView2);
        HostName.setText(game.hostName);

        TextView HostScore = (TextView) itemlayout.findViewById(R.id.textView3);
        HostScore.setText(game.hostScore);

        ImageView GuestLogo = (ImageView) itemlayout.findViewById(R.id.imageView2);
        GuestLogo.setImageResource(game.guestLogo);

        TextView GuestName = (TextView) itemlayout.findViewById(R.id.textView4);
        GuestName.setText(game.guestName);

        TextView GuestScore = (TextView) itemlayout.findViewById(R.id.textView5);
        GuestScore.setText(game.guestScore);

        if(Integer.parseInt(game.hostScore) > Integer.parseInt(game.guestScore)) {
            HostScore.setTextColor(Color.RED);
        }
        else {
            GuestScore.setTextColor(Color.RED);
        }


        return itemlayout;

    }

}
