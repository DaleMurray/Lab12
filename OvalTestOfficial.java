import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Oval and the Circle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class OvalTestOfficial
{
    private Oval o1 = new Oval(new Point(100, 100), 50, 100, Color.BLACK, true);
    private Oval o2 = new Oval(new Point(100, 100), 75, 50, Color.CYAN, false);
    
    private Circle c1 = new Circle(new Point(200, 300), 60, Color.BLUE, true);
    private Circle c2 = new Circle(new Point(200, 300), 75, Color.RED, false);

    /**
     * Verify the affects of the constructor for the Oval and Circle
     * The location, the diameter(s), the color, and the filled flag
     */
    @Test
    public void testOvalConstructorPoint()
    {
        // Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Oval is more than 1", 1, o1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Oval is more than 1", 1, o2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c2.getLocation().length);

        // Verify the location for each shape
        // TODO: implement this.

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Oval", Color.BLACK, o1.getColor());
        Assert.assertEquals("Incorrect color for the Oval", Color.CYAN, o2.getColor());
        Assert.assertEquals("Incorrect color for the Circle", Color.BLUE, c1.getColor());
        Assert.assertEquals("Incorrect color for the Circle", Color.RED, c2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Oval", o1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Oval", o2.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Circle", c1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Circle", c2.isFilled());
        
        // Verify the diameter(s) are correctly set
        Assert.assertEquals("Incorrect diameter1 for the Oval", 50, o1.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Oval", 100, o1.getDiameter2());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 75, o2.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 50, o2.getDiameter2());

        Assert.assertEquals("Incorrect diameter for the Cirlce", 60, c1.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 60, c1.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 60, c1.getDiameter2());
        
        Assert.assertEquals("Incorrect diameter for the Circle", 75, c2.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 75, c2.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 75, c2.getDiameter2());
    }
    
    // TODO: test color and fill in constructor.
}
