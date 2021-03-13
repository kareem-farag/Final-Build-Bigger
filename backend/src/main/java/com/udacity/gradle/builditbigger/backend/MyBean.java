package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.JokesProvider;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {


        return new JokesProvider().getJokes();
    }

    public void setData(String data) {
        myData = data;
    }
}