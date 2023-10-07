module unit04 {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.media;
    

    opens unit04 to javafx.fxml;
    exports unit04;
    exports unit04.mypod;
    
}
