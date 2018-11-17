
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, -100), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle outerEarL = new RightTriangle(new Point(240, 185), 50, -150, Color.ORANGE, true);
        RightTriangle outerEarR = new RightTriangle(new Point(560, 185), -50, -150, Color.ORANGE, true);
        RightTriangle innerEarL = new RightTriangle(new Point(245, 185), 30, -120, Color.PINK, true);
        RightTriangle innerEarR = new RightTriangle(new Point(555, 185), -30, -120, Color.PINK, true);
        
        // Eyes:
        Oval pupilR = new Oval(new Point(500, 225), 25, 50, Color.BLACK, true);
        Oval pupilL = new Oval(new Point(300, 225), 25, 50, Color.BLACK, true);
        Oval irisR = new Oval(new Point(500, 200), 50, 70, Color.GREEN, true);
        Oval irisL = new Oval(new Point(300, 200), 50, 70, Color.GREEN, true);
        
        // Nose
        Circle nose = new Circle(new Point(400, 300), 30, Color.BLACK, true);
        
        //Mouth
        PolyLine mouth1 = new PolyLine(new Point(400, 420), new Point(320, 390), 30, Color.BLACK, true);
        PolyLine mouth2 = new PolyLine(new Point(400, 420), new Point(480, 390), 30, Color.BLACK, true);
        Oval tounge = new Oval(new Point(430, 390), 40, 60, Color.PINK, true);
        
        // Collar:
        Oval collar = new Oval(new Point(400, 450), 250, 50, Color.BLUE, true);
        Circle tag1 = new Circle(new Point(400, 440), 60, Color.RED, true);
        Circle tag2 = new Circle(new Point(400, 450), 50, Color.BLACK, false);
        
        // Square around the dog:
        Square frame = new Square(new Point(400, 280), 520, Color.BLUE, false);
        
        // Circle around the dog
        Circle frame2 = new Circle(new Point(400, -460), 740, Color.BLACK, false);
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(outerEarL);
        drawPanel.addShape(outerEarR);
        drawPanel.addShape(innerEarL);
        drawPanel.addShape(innerEarR);
        drawPanel.addShape(base);
        drawPanel.addShape(irisR);
        drawPanel.addShape(irisL);
        drawPanel.addShape(pupilR);
        drawPanel.addShape(pupilL);
        drawPanel.addShape(nose);
        drawPanel.addShape(collar);
        drawPanel.addShape(tag1);
        drawPanel.addShape(tag2);
        drawPanel.addShape(frame);
        drawPanel.addShape(frame2);
        drawPanel.addShape(mouth1);
        drawPanel.addShape(mouth2);
        drawPanel.addShape(tounge);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
