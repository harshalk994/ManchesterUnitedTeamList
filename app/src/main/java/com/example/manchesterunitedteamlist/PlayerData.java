package com.example.manchesterunitedteamlist;

public class PlayerData {

    private String name;
    private int image;
    private String position;

    public PlayerData(int image, String name, String position) {
        this.image = image;
        this.name = name;
        this.position = position;
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
