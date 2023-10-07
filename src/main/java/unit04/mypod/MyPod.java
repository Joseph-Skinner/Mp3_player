package unit04.mypod;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MyPod extends Application {

    
    Song twistedLove = new Song("media/sounds/Twisted Love.wav","Twisted Love: AKA the best song on Roblox Retail Tycoon 2","file:media/images/mypod/retailtycoon2.jpg");
    Song pools = new Song("media/sounds/Glass Animals - Pools - Audiotree Live.wav", "Pools Glass Animals", "file:media/images/mypod/pools.jpg");
    Song bestOfFriends = new Song("media/sounds/Polyenso - Best Of Friends.wav","Best of Friends by Polyenso", "file:media/images/mypod/polyenso.jpg");
    Song cancerInTheWater = new Song("media/sounds/Clarence Clarity - Cancer In The Water.wav", "Cancer in the Water by Creedence Clearwater", "file:media/images/mypod/cancerinthewater.jpg");
    Song glowWorms = new Song("media/sounds/Vashti Bunyan - Glow Worms.wav", "Glow Worms by Vashit Bunyan", "file:media/images/mypod/vashit.jpg");
    Song grafittiOnATuesdayNight = new Song("media/sounds/Neat Beats - Graffiti on a Tuesday Night.wav", "Graffitti on a Tuesday Night by neat beats", "file:media/images/mypod/neatbeats.jpg");

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MyPod");


        VBox vbox = new VBox();
        GridPane gridPane = new GridPane();
        BorderPane pane = new BorderPane();
    

        Button[] songButtons = new Button[6];
        songButtons[0] = makeSongButton(twistedLove,pane);
        songButtons[1] = makeSongButton(pools,pane);
        songButtons[2] = makeSongButton(bestOfFriends,pane);
        songButtons[3] = makeSongButton(cancerInTheWater,pane);
        songButtons[4] = makeSongButton(glowWorms,pane);
        songButtons[5] = makeSongButton(grafittiOnATuesdayNight,pane);
        VBox.setVgrow(songButtons[0], Priority.ALWAYS);
        VBox.setVgrow(songButtons[1], Priority.ALWAYS);
        VBox.setVgrow(songButtons[2], Priority.ALWAYS);
        VBox.setVgrow(songButtons[3], Priority.ALWAYS);
        VBox.setVgrow(songButtons[4], Priority.ALWAYS);
        VBox.setVgrow(songButtons[5], Priority.ALWAYS);
        vbox.getChildren().addAll(songButtons);

       


        gridPane.add(vbox, 2, 1);
        gridPane.add(pane,1,1);
        
        

        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
        
    }


    
    private static Button makeSongButton(Song song,BorderPane pane){

        Media media = new Media(new File(song.getSongPath()).toURI().toString());

        Button button = new Button();
        button.setText(song.getDescription());
        button.setPadding(new Insets(10));
        button.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        button.setOnAction(new SongChanger(new ImageView(new Image(song.getImagePath())), pane,new MediaPlayer(media)));
        return button;
    }



    public static void main(String[] args) {
        launch(args);
    }




}
