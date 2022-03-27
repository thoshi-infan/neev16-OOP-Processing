import processing.core.PApplet;

public class Rectangle {

    private int xPosition;
    private int yPosition;
    private int length;
    private int breadth;
    private int speed;

    public Rectangle(int xPosition,int yPosition,int length,int breadth,int speed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.length    = length;
        this.breadth   = breadth;
        this.speed     = speed;
    }

    public void move(){
        xPosition+=speed;
    }

    public void display(PApplet applet){   //By using instance we can use ellipse method

        applet.ellipse(xPosition,yPosition,length,breadth);
    }
}
