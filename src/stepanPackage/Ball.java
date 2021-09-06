package stepanPackage;
import java.lang.*;

public class Ball {
    private String colour;
    private String shape;

    public Ball (String ballColour, String ballShape) {
        this.colour = ballColour;
        this.shape = ballShape;
    }

    public Ball (String ballColour) {
        this.colour = ballColour;
        this.shape = "round";
    }

    public Ball () {
        this.colour = "white";
        this.shape = "round";
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String ToString(){
        return "The ball's colour is "+this.colour+", shape is "+this.shape;
    }
}
