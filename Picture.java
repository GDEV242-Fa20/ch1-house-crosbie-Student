/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  William Crosbie
 * @version 2020-09-06
 */
public class Picture
{
    //private Square wall;
    //private Square window;
    private Triangle roof;
    private Circle bullseye;
    private Circle secondring;
    private Circle firstring;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        //wall = new Square();
        //window = new Square();
        roof = new Triangle();  
        bullseye = new Circle();
        secondring = new Circle();
        firstring = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            // wall.moveHorizontal(-140);
            // wall.moveVertical(20);
            // wall.changeSize(120);
            // wall.changeColor("blue");
            // wall.makeVisible();
            
            // window.changeColor("black");
            // window.moveHorizontal(-120);
            // window.moveVertical(40);
            // window.changeSize(40);
            // window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            firstring.changeColor("magenta");
            firstring.moveHorizontal(100);
            firstring.moveVertical(-40);
            firstring.changeSize(160);
            firstring.makeVisible();
            
            secondring.changeColor("blue");
            secondring.moveHorizontal(100);
            secondring.moveVertical(-40);
            secondring.changeSize(120);
            secondring.makeVisible();
            
            bullseye.changeColor("yellow");
            bullseye.moveHorizontal(100);
            bullseye.moveVertical(-40);
            bullseye.changeSize(80);
            bullseye.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        // wall.changeColor("black");
        // window.changeColor("white");
        roof.changeColor("black");
        //sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        // wall.changeColor("red");
        // window.changeColor("black");
        roof.changeColor("green");
        //sun.changeColor("yellow");
    }
}
