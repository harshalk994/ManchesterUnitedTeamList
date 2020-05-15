# Manchester United Team List

<p align="center"><b>App Name</b></p><br>
<p align="center"><b>Manchester United Team List</b><p>


<p align="center"><b>Contents</b></p>


| Content |	Description |
| ------- | ----------- |
| Activity 1 | Splash Screen |
| Activity 2 | Player List (Custom List) |
| Activity 3 | General Player Information |
| Activity 4 | Manchester United Store WebView |
| Activity 5 | Player Statistics |
| Activity 6 | Web View to display additional info about the player |
| Additional Specifications |	Youtube App, Title Bar, App Icon |


<br>

<p align="center"><b>Activity 1</b></p>
          <p align="center"><b>Splash Screen</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/logo.jpg" align="centre" height=600 width=400></img></center><br>
  
<b>B) Functionality:</b><br>
<p>The Splash Screen will open as the Launcher Activity and load for 4 seconds before redirecting to the second activity ie the Custom List.</p>
<br>
<b>C) Personal Contribution:</b></br>
<p>      
•	Added Manchester United logo to give a good look and feel to the app.<br>
•	Added a progress bar on screen to let the user know that the app is loading <br>
•	Added finish() function which will not allow the user to load the Splash Screen Activity on hitting the back button from               Activity 2 i.e. Splash Screen will load only once per launch of the app. <br>
 </p>
 
 <br>
 <p align="center"><b>Activity 2</b></p>
          <p align="center"><b>Player List(Custom List)</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/activity2.jpg" align="centre" height=600 width=400></img></center><br>
  
<b>B) Functionality:</b><br>
<p>This Activity consists of a custom list of the Manchester United team players. The list contains images of players, their names, their positions and their nationality using national flags of their respective countries. The list of players (Player Image, Name, Position, Flag) is being populated from XML file (player_data.xml) using XML parsing and being stored in objects using model class. The list is scrollable. To view info of a player, the user can click on the list item of the respective player and he will be directed to Activity 3.

</p>
<br>
<b>C) Personal Contribution:</b></br>
<p>      
•	The interface of the list is user-friendly. User can easily scroll down the list and pick the player of his/her choice whose additional info they would like to view. <br>
•	All the images are stored in the assets folder and accessed through the AssetManager Class. <br>
•	Tried to make the list similar to the player list displayed in the Fantasy Premiere League App. <br>
•	The Item On Click Listener will redirect the user to the exact Player Info activity page of the player on which the user has clicked and intends to view more info of the respective player. <br>

 </p>
<br>

<p align="center"><b>Activity 3</b></p>
          <p align="center"><b>General Player Information</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/activity 3.jpg" align="centre" height=600 width=400></img></center><br>
  
<b>B) Functionality:</b><br>
<p>This Activity consists of general information of the player that the user selected from the Activity 2 i.e. the custom list. It lists general info such as the Player Ratings denoted by the golden stars (ratings out 5 starts), Country of Birth, National Team, Age, Date of Birth, Premiere League Debut, Appearances and Goals. It consists of a play video button that will play some video related to that player in the Youtube app. There is a buy now button, that will redirect the user to the official Manchester United Shop website (opened in a webview in app) to buy the player jersey. The details of player and the links to the play video and buy buttons are parsed from XML. On clicking the Stats button, the user will be directed to Activity 4 to view the player stats of that player.

</p>
<br>
<b>C) Personal Contribution:</b></br>
<p>      
•	Play Video Button: When user clicks on the play video button, a video will be played in the Youtube App. On clicking back button user can go back from Youtube App to the Main App. <br>
•	Buy Now Button: When user clicks on the buy now button, he/she will be redirected to the official Manchester United Shop website and view the Player jersey as displayed on the app screen. The Website will open in a webview which is another additional activity that I have added. User can directly buy the jersey from this webview and if he wishes to explore other kit options from the shop he can do so by navigating the website. <br> 
•	Added a Scroll view to fit the text below “Personal Information” to fit in devices with smaller screens. If the user is having a small dimension screen, the button or some info will be missing if a scroll view is not added, to overcome this I have added a scroll view. <br>
•	The design of the activity is consistent and smooth to give a simple and user-friendly experience to the users. <br>


 </p>
 <br>
 
 <p align="center"><b>Activity 4</b></p>
          <p align="center"><b>Manchester United Store WebView</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/activity 4.jpg" align="centre" height=600 width=400></img></center><br>

<b>C) Personal Contribution:</b></br>
<p>      
•	The Buy Now button in Activity 3 will redirect the user to the additional activity (ShopWebView) which is a webview and will open the official Manchester United Store website and display the respective player’s kit page with the kit specs and buy now option. <br>
•	The links to the official kits are all parsed through the XML parser and declared in the XML file (player_data.xml). <br>

 </p>
 <br>
 
 <p align="center"><b>Activity 5</b></p>
          <p align="center"><b>Player Statistics</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/activity 5.jpg" align="centre" height=600 width=400></img></center><br>
  
<b>B) Functionality:</b><br>
<p>
          This Activity displays some more information about the player. It displays the player statistics and player image. The more info button redirects the user to Activity 6.


</p>
<br>
<b>C) Personal Contribution:</b></br>
<p>      
•	The design of the activity is consistent and smooth to give a simple and user-friendly experience to the users. <br>
•	Displays a range of stats about the player through XML parsing. <br>


 </p>
<br>

<p align="center"><b>Activity 6</b></p>
          <p align="center"><b>Web View to display additional info about the player</b></p><br>
  <b>A) User Interface:</b><br>
  <center><img src="images/activity 6.jpg" align="centre" height=600 width=400></img></center><br>
  
<b>B) Functionality:</b><br>
<p>
         This Activity consists of a Web View that will embed and open the official Manchester United website and display the respective player’s information in it.


</p>
<br>
<b>C) Personal Contribution:</b></br>
<p>      
•	The links provided are accurate and will open the player info page of the respective player in the webview. <br>
•	The links are parsed through the XML parser and declared in the XML file (player_data.xml). <br>



 </p>

<br>

<p align="center"><b>Additional Specifications</b></p>
  <p>        
  <b>A) Youtube Integration</b><br>
          •	<b>User Interface:</b><br>
            <center><img src="images/youtube.jpg" align="centre" height=600 width=400></img></center><br>
            •	<b>Personal Contribution:</b>  <br>
o	The Play Video Button in Activity 3 will redirect the user to the youtube app and will play a video of the respective player.<br>
o	The links of the youtube videos are all parsed through the XML parser and declared in the XML file (player_data.xml).
</p>
<p>
          <b>B)	Title Bar: </b><br>
•	User Interface: <br>
           <center><img src="images/title bar.png" align="centre" height=75 width=500></img></center><br>
           •	<b>Personal Contribution:</b> <br>
o	The title bar consists of a relative layout in which I have added a Text View and 3 Image Views (Addidas logo, Manchester United Logo, Aon Logo). I have aligned the layouts as shown in the screenshot using the align functionalities available under the relative layout for eg, layout_toRightof, layout_toLeftof etc. The title bar gives a good look and feel to the app. <br>

<p>
          <b>C) Logo/App Icon</b><br>
          •	User Interface:<br>
          <center><img src="images/app icon.png" align="centre" height=75 width=75></img></center><br>
          •	<b>Personal Contribution:</b> <br>
o	  Changed the app icon in the AndroidManifest.xml file. The   
  logo image is shown above. Changed the image for
  android:icon and android:roundIcon with above image.

          
 </p>
 
 
 
