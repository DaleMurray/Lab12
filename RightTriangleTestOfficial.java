
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    // TODO: complete testing
	private static RightTriangle rt1 = new RightTriangle(new Point(100, 100), 100, 100, Color.BLACK, true);
	private static Point rt1V = new Point(100, 100);
	private static Point rt1T = new Point(100, 200);
	private static Point rt1B = new Point(200, 100);
	private static RightTriangle rt2 = new RightTriangle(new Point(150, 150), 25, 25, Color.CYAN, false);
	private static Point rt2V = new Point(150, 150);
	private static Point rt2T = new Point(150, 175);
	private static Point rt2B = new Point(175, 150);
	/**
     * Right number of points?
     */
    @Test
    public void testSquareConstructorPointsArrayLength()
    {
        Point[] pts = rt1.getLocation();
        Assert.assertEquals(3, pts.length);
    }
    
    /**
     * Check points
     */
    @Test
    public void testRightTriangleConstructorCalculatedPoints()
    {
        Point[] pts1 = rt1.getLocation();
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts1, rt1V));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts1, rt1T));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts1, rt1B));
        
        Point[] pts2 = rt2.getLocation();
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts2, rt2V));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts2, rt2T));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet(pts2, rt2B));
        
    }
    
    /**
     * Unfilled case
     */
    @Test
    public void testSquareConstructorUnfilled()
    {
        Assert.assertFalse("Triangle fill incorrect.", rt2.isFilled());
    }
    
    /**
     * Filled case
     */
    @Test
    public void testSquareConstructorFilled()
    {
        Assert.assertTrue("Triangle fill incorrect.", rt1.isFilled());
    }
    
    /**
     * Color
     */
    @Test
    public void testSquareConstructorColor()
    {
        Color clr1 = rt1.getColor();
        Color clr2 = rt2.getColor();
        Assert.assertEquals("Triangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Triangle color incorrect.", Color.CYAN, clr2);
    }
}
