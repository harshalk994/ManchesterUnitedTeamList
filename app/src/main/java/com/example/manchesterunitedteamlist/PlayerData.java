package com.example.manchesterunitedteamlist;

import java.io.Serializable;

public class PlayerData implements Serializable {

    private String id;
    private String name;
    private String image;
    private String position;
    private String country;
    private String imageOnClick;
    private String jerseyNo;
    private String url;
    private String cob;
    private String nteam;
    private String age;
    private String dob;
    private String debut;
    private String apps;
    private String goals;
    private String kit;
    private String buy;

    public PlayerData(String image, String name, String position, String country, String id, String imageOnClick, String jerseyNo, String url, String cob, String nteam, String age, String dob, String debut, String apps, String goals, String kit, String buy) {
        this.image = image;
        this.name = name;
        this.position = position;
        this.country = country;
        this.id = id;
        this.imageOnClick = imageOnClick;
        this.jerseyNo = jerseyNo;
        this.url = url;
        this.cob = cob;
        this.nteam = nteam;
        this.age = age;
        this.dob = dob;
        this.debut = debut;
        this.apps = apps;
        this.goals = goals;
        this.kit = kit;
        this.buy = buy;
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

    public String getImageOnClick() {
        return imageOnClick;
    }

    public void setImageOnClick(String imageOnClick) {
        this.imageOnClick = imageOnClick;
    }

    public String getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(String jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCob() {
        return cob;
    }

    public void setCob(String cob) {
        this.cob = cob;
    }

    public String getNteam() {
        return nteam;
    }

    public void setNteam(String nteam) {
        this.nteam = nteam;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getApps() {
        return apps;
    }

    public void setApps(String apps) {
        this.apps = apps;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }
}
