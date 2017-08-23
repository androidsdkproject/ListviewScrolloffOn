package com.example.android1.listviewscrolloffon;

/**
 * Created by Android1 on 7/27/2017.
 */

public class ListItem {
    String data, input;

    ListItem(String data, String input) {
        this.data = data;
        this.input = input;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
