package com.denny.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by denny on 14-12-09.
 */
public class ColorWheel {
    //Member Variables
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //Mehtods
    public int getColor(){


        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new Random Number Generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        return Color.parseColor(mColors[randomNumber]);
    }
}
