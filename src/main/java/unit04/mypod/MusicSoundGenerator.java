package unit04.mypod;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class MusicSoundGenerator implements EventHandler<ActionEvent> {

    private final MediaPlayer player;
    
    public MusicSoundGenerator(MediaPlayer player){
        this.player = player;
    }

    @Override
    public void handle(ActionEvent arg0) {
     
        if(player.getStatus() == MediaPlayer.Status.PLAYING){
            player.stop();
        }
        if(player.getStatus() == MediaPlayer.Status.READY || player.getStatus() == Status.STOPPED){
            player.play();
            
        }

    }

    
}
