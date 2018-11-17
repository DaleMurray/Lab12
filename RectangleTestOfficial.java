import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    // TODO: implement this.
    private static Rectangle r1 = new Rectangle(new Point(100, 100), 10, 100, Color.BLACK, true);
    private static Point r1UL = new Point(95, 50);
    private static Point r1LL = new Point(105, 50);
    private static Point r1UR = new Point(95, 150);
    private static Point r1LR = new Point(105, 150);
    private static Rectangle r2 = new Rectangle(new Point(150, 150), 50, 300, Color.CYAN, false);
    private static Point r2UL = new Point(125, 0);
    private static Point r2LL = new Point(175, 0);
    private static Point r2UR = new Point(175, 300);
    private static Point r2LR = new Point(125, 300);

    /**
     * Right number of points?
     */
    @Test
    public void testSquareConstructorPointsArrayLength()
    {
        Point[] pts = r1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * Check points
     */
    @Test
    public void testSquareConstructorCalculatedPoints()
    {
        Point[] pts1 = r1.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1UR));
        
        Point[] pts2 = r2.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2UR));
        
    }
    
    /**
     * Unfilled case
     */
    @Test
    public void testSquareConstructorUnfilled()
    {
        Assert.assertFalse("Square fill incorrect.", r2.isFilled());
    }
    
    /**
     * Filled case
     */
    @Test
    public void testSquareConstructorFilled()
    {
        Assert.assertTrue("Square fill incorrect.", r1.isFilled());
    }
    
    /**
     * Color
     */
    @Test
    public void testSquareConstructorColor()
    {
        Color clr1 = r1.getColor();
        Color clr2 = r2.getColor();
        Assert.assertEquals("Square color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Square color incorrect.", Color.CYAN, clr2);
    }
}
