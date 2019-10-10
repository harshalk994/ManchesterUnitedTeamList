package com.example.manchesterunitedteamlist;

import java.io.Serializable;

public class PlayerData implements Serializable {

    private String id;
    private String name;
    private String image;
    private String position;
    private String country;


    public PlayerData(String image, String name, String position, String country, String id) {
        this.image = image;
        this.name = name;
        this.position = position;
        this.country = country;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
