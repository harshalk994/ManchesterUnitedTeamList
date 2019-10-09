package com.example.manchesterunitedteamlist;

public class PlayerData {

    private String name;
    private int image;
    private String position;
    private int country;

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public PlayerData(int image, String name, String position, int country) {
        this.image = image;
        this.name = name;
        this.position = position;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
