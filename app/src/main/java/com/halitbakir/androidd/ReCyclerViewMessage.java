package com.halitbakir.androidd;

public class ReCyclerViewMessage {
    //field
    private String name;
    private int photo;

    //parametresiz constructor
    public ReCyclerViewMessage() {
    }

    //parametreli constructor
    public ReCyclerViewMessage(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
