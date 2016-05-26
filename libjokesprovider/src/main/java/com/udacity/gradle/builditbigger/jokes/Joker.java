package com.udacity.gradle.builditbigger.jokes;

import java.util.Random;

public class Joker {
    private static String[] jokes;

    static {
        jokes = new String[13];
        jokes[0] = "Q: Why do java programmers wear glasses?\n" +
                "A: Because they can't C.";
        jokes[1] = "Can a kangaroo jump higher than a house? " +
                "Of course, a house doesn’t jump at all.";
        jokes[2] = "A man asks a farmer near a field, “Sorry sir," +
                " would you mind if I crossed your field instead " +
                "of going around it? You see, I have to catch the 4:23 train." +
                "The farmer says, “Sure, go right ahead." +
                "And if my bull sees you, you’ll even catch the 4:11 one.";
        jokes[3] = "It is so cold outside I saw a politician with his hands in his own pockets";
        jokes[4] = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away";
        jokes[5] = "Police officer: Can you identify yourself, sir?" +
                "Driver pulls out his mirror and says:Yes, it's me.";
        jokes[6] = "When my wife starts to sing I always go out and do some " +
                "garden work so our neighbors can see there's no domestic violence going on";
        jokes[7] = "How can you tell you have a really bad case of acne?" +
                "It’s when the blind try to read your face.";
        jokes[8] = "Q. Why do the French like to eat snails so much?\n" +
                "A. They can’t stand fast food.";
        jokes[9] = "Husband: “Oh the weather is lovely today. Shall we go out for a quick jog?" +
                "Wife: “Hahaha, I love the way you pronounce ‘Shall we go out and have a cake";
        jokes[10] = "Daddy did you know that girls are smarter than boys?" +
                "No, I didn’t know that." +
                "There you go.";
        jokes[11] = " Late one night a mugger wearing a mask stopped a well-dressed man and stuck a gun in his ribs." +
                "Give me your money, he demanded. Scandalized, the man replied, " +
                "You can’t do this – I’m a US Congressman!" +
                "Oh! In that case,smiled the robber,Give me MY money!";
        jokes[12] = " A recent scientific study showed that out of " +
                "2,293,618,367 people," +
                " 94% are too lazy to actually read that number";
    }

    public static String getRandomJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}