package com.example.manchesterunitedteamlist;

import java.io.Serializable;

public class PlayerData implements Serializable {

   //Model Class with constructor and getter setters

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
    private String champion;
    private String wins;
    private String losses;
    private String cleans;
    private String og;
    private String assists;
    private String passes;
    private String crosses;
    private String through;
    private String fouls;
    private String yellowc;
    private String redc;
    private String weburl;
    private String ratings;

    public PlayerData(String image, String name,  String position, String country, String id, String imageOnClick,
                      String jerseyNo, String url, String cob, String nteam, String age, String dob, String debut,
                      String apps, String goals, String kit, String buy, String champion, String wins, String losses,
                      String cleans, String og, String assists, String passes, String crosses, String through,
                      String fouls, String yellowc, String redc, String weburl, String ratings) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.position = position;
        this.country = country;
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
        this.champion = champion;
        this.wins = wins;
        this.losses = losses;
        this.cleans = cleans;
        this.og = og;
        this.assists = assists;
        this.passes = passes;
        this.crosses = crosses;
        this.through = through;
        this.fouls = fouls;
        this.yellowc = yellowc;
        this.redc = redc;
        this.weburl = weburl;
        this.ratings = ratings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getCleans() {
        return cleans;
    }

    public void setCleans(String cleans) {
        this.cleans = cleans;
    }

    public String getOg() {
        return og;
    }

    public void setOg(String og) {
        this.og = og;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getPasses() {
        return passes;
    }

    public void setPasses(String passes) {
        this.passes = passes;
    }

    public String getCrosses() {
        return crosses;
    }

    public void setCrosses(String crosses) {
        this.crosses = crosses;
    }

    public String getThrough() {
        return through;
    }

    public void setThrough(String through) {
        this.through = through;
    }

    public String getFouls() {
        return fouls;
    }

    public void setFouls(String fouls) {
        this.fouls = fouls;
    }

    public String getYellowc() {
        return yellowc;
    }

    public void setYellowc(String yellowc) {
        this.yellowc = yellowc;
    }

    public String getRedc() {
        return redc;
    }

    public void setRedc(String redc) {
        this.redc = redc;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
