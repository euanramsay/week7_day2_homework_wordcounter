package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class Counter implements Countable {

    String mAnswers;
    int count;

    public int getLength() {
        count = mAnswers.length();
        return count;
    }

    public String getAnswers() {
        mAnswers = new Integer(mAnswers).toString();
    }

}
