package com.udacity.gradle.builditibigger.backend;

import com.udacity.gradle.builditbigger.jokes.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

   public String getJoke(){
       return Joker.getRandomJoke();
   }
}