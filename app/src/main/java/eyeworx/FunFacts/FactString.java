package eyeworx.FunFacts;

import java.util.Random;

/**
 * Created by Shreerama on 10/1/2017.
 */
public class FactString {
    String[] fact = {"Leonardo da Vinci could write with one hand and draw with the other at the same time.",
            "A traffic jam lasted lasted for more than 10 days, with cars only moving 0.6 miles a day.",
            "There are over 200 corpses on Mount Everest and they are used as way points for climbers.",
            "Russia didn't consider beer to be alcohol until 2011. It was previously classified as a soft drink.",
            "Two-thirds of the people on Earth have never seen snow.", "A hummingbird weighs less than a penny.",
            "The average person walks the equivalent of three times around the world in a lifetime.",
            "It would take over 1,000 years to watch every video on YouTube.",
            "A cockroach can live several weeks with its head cut off.",
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};

    public String getFact(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(fact.length);
        return fact[randomNumber];
    }
}
