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
        NodeList imageOfPlayer = xml.getElementsByTagName("imageonclick");
        NodeList jerseyOfPlayer = xml.getElementsByTagName("jerseyno");
        NodeList urlOfPlayer = xml.getElementsByTagName("url");
        NodeList cOfPlayer = xml.getElementsByTagName("birth");
        NodeList nOfPlayer = xml.getElementsByTagName("nation");
        NodeList aOfPlayer = xml.getElementsByTagName("age");
        NodeList dOfPlayer = xml.getElementsByTagName("dob");
        NodeList plOfPlayer = xml.getElementsByTagName("pld");
        NodeList apOfPlayer = xml.getElementsByTagName("apps");
        NodeList gOfPlayer = xml.getElementsByTagName("goals");
        NodeList kOfPlayer = xml.getElementsByTagName("kit");
        NodeList bOfPlayer = xml.getElementsByTagName("buy");


        data = new PlayerData[playerName.getLength()];

        for(int i=0; i<data.length;i++){
            String image = imageList.item(i).getFirstChild().getNodeValue();
            //int img = Integer.valueOf(image);
            String name = playerName.item(i).getFirstChild().getNodeValue();
            String position = playerPosition.item(i).getFirstChild().getNodeValue();
            String country = playerCountry.item(i).getFirstChild().getNodeValue();
            String jersey = playerId.item(i).getFirstChild().getNodeValue();
            String img = imageOfPlayer.item(i).getFirstChild().getNodeValue();
            String squadno = jerseyOfPlayer.item(i).getFirstChild().getNodeValue();
            String urlPass = urlOfPlayer.item(i).getFirstChild().getNodeValue();
            String birth = cOfPlayer.item(i).getFirstChild().getNodeValue();
            String nation = nOfPlayer.item(i).getFirstChild().getNodeValue();
            String age = aOfPlayer.item(i).getFirstChild().getNodeValue();
            String dob = dOfPlayer.item(i).getFirstChild().getNodeValue();
            String pdebut = plOfPlayer.item(i).getFirstChild().getNodeValue();
            String appearance = apOfPlayer.item(i).getFirstChild().getNodeValue();
            String goal = gOfPlayer.item(i).getFirstChild().getNodeValue();
            String kit = kOfPlayer.item(i).getFirstChild().getNodeValue();
            String buy = bOfPlayer.item(i).getFirstChild().getNodeValue();
            //int ctry = Integer.valueOf(country);

            data[i] = new PlayerData(image, name, position, country, jersey, img, squadno, urlPass, birth, nation, age, dob, pdebut, appearance, goal, kit, buy);
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
