package unit04.mypod;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class SongChanger implements EventHandler<ActionEvent>, SongObserver {

    private ImageView imageView;
    private BorderPane pane;
    private final MediaPlayer player;
    
    


    public SongChanger(ImageView imageView,BorderPane pane,MediaPlayer player){
        this.imageView = imageView;
        this.pane = pane;
        this.player = player;
        
    }


    @Override
    public void onSongChanged(Song song) {
        imageView.setImage(new Image(song.getImagePath()));
      
    }

    @Override
    public void handle(ActionEvent event) {
        pane.setLeft(imageView);
        if(player.getStatus() == MediaPlayer.Status.PLAYING){
            player.stop();
        }
        if(player.getStatus() == MediaPlayer.Status.READY || player.getStatus() == Status.STOPPED){
            player.play();
        }
    }


  

    
}
