package com.example.manchesterunitedteamlist;

import android.content.Context;
import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class PlayerXMLData {

    private PlayerData [] data;
    private Context myContext;

    public PlayerXMLData(Context c) {
        this.myContext = c;

        InputStream stream = this.myContext.getResources().openRawResource(R.raw.player_data);

        DocumentBuilder builder = null;
        Document xml = null;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xml = builder.parse(stream);
        } catch (Exception e) {
            Log.e("***","******");
            System.out.println("Unable to parse");
        }

        NodeList imageList = xml.getElementsByTagName("image");
        NodeList playerName = xml.getElementsByTagName("name");
        NodeList playerPosition = xml.getElementsByTagName("position");
        NodeList playerCountry = xml.getElementsByTagName("flagimg");
        NodeList playerId = xml.getElementsByTagName("id");


        data = new PlayerData[playerName.getLength()];

        for(int i=0; i<data.length;i++){
            String image = imageList.item(i).getFirstChild().getNodeValue();
            //int img = Integer.valueOf(image);
            String name = playerName.item(i).getFirstChild().getNodeValue();
            String position = playerPosition.item(i).getFirstChild().getNodeValue();
            String country = playerCountry.item(i).getFirstChild().getNodeValue();
            String jersey = playerId.item(i).getFirstChild().getNodeValue();
            //int ctry = Integer.valueOf(country);

            data[i] = new PlayerData(image, name, position, country, jersey);
        }


    }

   public PlayerData getPlayerData(int i){
        return data[i];
    }

    public int getLength(){

        return data.length;
    }


   /* public int [] getImages(){

        //construct the String []
        int [] images = new int[data.length];

        //populate it with names
        for(int i=0;i<data.length;i++){
            images[i] = data[i].getImage();
        }

        return images;
    }*/

    public String [] getNames(){

        //construct the String []
        String [] names = new String[data.length];

        //populate it with names
        for(int i=0;i<data.length;i++){
            names[i] = data[i].getName();
        }

        return names;
    }


}
