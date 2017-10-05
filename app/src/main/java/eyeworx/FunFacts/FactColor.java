package eyeworx.FunFacts;

import java.util.Random;

/**
 * Created by Shreerama on 10/1/2017.
 */
public class FactColor {
    String[] Colors = {
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
            "#b7c0c7"};

    public int getColor(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(Colors.length);
        int colorNum = android.graphics.Color.parseColor(Colors[randomNumber]);
        return colorNum;
    }
}

