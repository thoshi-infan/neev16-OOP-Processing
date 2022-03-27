import processing.core.PApplet;

public class Ball {

    private int xPosition;
    private int yPosition;
    private int diameter;
    private int speed;

    public Ball(int xPosition, int yPosition, int diameter,int speed){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter  = diameter ;
        this.speed     = speed;
    }

    public void move(){
        xPosition+=speed;
    }

    public void display(PApplet applet){    //By using instance we can use ellipse method
        applet.ellipse(xPosition,yPosition,diameter,diameter);
    }
}
