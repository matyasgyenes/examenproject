package be.kdg.landenquiz.model;

import javafx.scene.image.Image;

public class Land {

    private String land;
    private String hoofdstad;
    private String werelddeel;

    public Land(String land, String hoofdstad, String werelddeel) {
        this.land = land;
        this.hoofdstad = hoofdstad;
        this.werelddeel = werelddeel;
    }

    //Getters
    public String getLand() { return land; }
    public String getHoofdstad() { return hoofdstad; }
    public String getWerelddeel() { return werelddeel; }
}
