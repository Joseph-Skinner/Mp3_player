package unit04.mypod;

import javafx.scene.image.ImageView;

public class Song {
    
    private String songPath;
    private String description;
    private String imagePath;

    public Song(String songPath, String description, String imagePath){
        this.songPath = songPath;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getSongPath() {
        return songPath;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public ImageView  makeImage(){

        ImageView imageView = new ImageView(imagePath);
        return imageView;

    }

}
