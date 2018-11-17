import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class PolyLineTest
{
    private static PolyLine pl1 = new PolyLine(new Point(100, 100), new Point(150, 150), 50, Color.BLACK, true);
    private static Point pl1UL = new Point(100, 100);
    private static Point pl1LL = new Point(100, 150);
    private static Point pl1UR = new Point(150, 150);
    private static Point pl1LR = new Point(150, 200);
    private static PolyLine pl2 = new PolyLine(new Point(50, 70), new Point(100, 100), -25, Color.CYAN, false);
    private static Point pl2UL = new Point(50, 70);
    private static Point pl2LL = new Point(50, 45);
    private static Point pl2UR = new Point(100, 100);
    private static Point pl2LR = new Point(100, 75);

    /**
     * plectangle construction
     */
    @Test
    public void testPolyLineConstructorPointsArrayLength()
    {
        Point[] pts = pl1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * plectangle construction: points
     */
    @Test
    public void testPolyLineConstructorCalculatedPoints()
    {
        Point[] pts1 = pl1.getLocation();
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UL));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LL));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LR));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UR));
        
        Point[] pts2 = pl2.getLocation();
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UL));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LL));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LR));
        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UR));
    }
    
    /**
     * Unfilled constructor
     */
    @Test
    public void testPolyLineConstructorUnfilled()
    {
        Assert.assertFalse("PolyLine fill incorrect.", pl2.isFilled());
    }
    
    /**
     * Filled constructor
     */
    @Test
    public void testPolyLineConstructorFilled()
    {
        Assert.assertTrue("PolyLine fill incorrect.", pl1.isFilled());
    }
    
    /**
     * Color constructor
     */
    @Test
    public void testPolyLineConstructorColor()
    {
        Color clr1 = pl1.getColor();
        Color clr2 = pl2.getColor();
        Assert.assertEquals("PolyLine color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("PolyLine color incorrect.", Color.CYAN, clr2);
    }
}
