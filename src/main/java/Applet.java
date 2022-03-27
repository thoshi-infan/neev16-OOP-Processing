import processing.core.PApplet;

public class Applet extends PApplet{   // For Animation Purpose We are Using PApplet Class.

    private final int width  = 500;
    private final int height = 500;

    private int xPosition = 1;
    private int yPosition = 1/5;
    private int diameter  = 20;
    private int length    = 20;
    private int breadth   = 25;
    private int speed     = 1;

    Ball ball1,ball2,ball3;
    Rectangle rectangle1,rectangle2;

    public static void main(String args[]){
        PApplet.main("Applet",args);
    }

    public void settings(){  // This is the PApplet methods we can override the method here

        size(width,height);
    }

    public void setup(){   //setup method execute once

        ball1 = new Ball(xPosition,yPosition*height,diameter,speed+1);
        ball2 = new Ball(xPosition,yPosition*height*3,diameter,speed+3);
        ball3 = new Ball(xPosition,yPosition*height*5,diameter,speed+5);

        rectangle1 = new Rectangle(xPosition,yPosition*height*2,length,breadth,speed+2);
        rectangle2 = new Rectangle(xPosition,yPosition*height*4,length,breadth,speed+4);
    }

    public void draw(){                 // draw method execute infinite times.

        ball1.display(this);     // this keyword refers to the current class Object.
        ball1.move();
        ball2.display(this);
        ball2.move();
        ball3.display(this);
        ball3.move();
        rectangle1.display(this);
        rectangle1.move();
        rectangle2.display(this);
        rectangle2.move();
    }
}
