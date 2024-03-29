package com.denny.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends ActionBarActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables, and assign the Views from the layout file
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        final Button showFactButton = (Button)findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                

                //Update the label with our dynamic fact
                factLabel.setText(mFactBook.getFact());
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
    }
}
