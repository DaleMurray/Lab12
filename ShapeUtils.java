import java.awt.Point;

/**
 * Utility class for Shapes to assist with determining 
 * the relative location of points
 * Used in tests
 * 
 * @author CS2334
 * @version October 26, 2017
 * Lab 10
 */
public class ShapeUtils
{
    /**
     * Return true if a point is in a set of points.
     * 
     * @param points Set of points
     * @param point Point in question
     * @return true if the point in question is equal to one of the points in the set
     */
    public static boolean pointInSet(Point[] points, Point point)
    {
        // Loop through the points in the set
        for (int i = 0; i < points.length; ++i)
        {
            if (point.equals(points[i]))
            {
                // Match!
                return true;
            }
        }
        // No match
        return false;
    }
    
    /**
     * Return true if a point is in a set of points.
     * 
     * @param points Set of points
     * @param point Point in question
     * @param delta point must be within delta of each point (along each dimension)
     * @return true if the point is within some delta distance of a point in the set
     */
    public static boolean pointInSet(Point[] points, Point point, int delta)
    {
        // Loop through the points in the set
        for (int i = 0; i < points.length; ++i)
        {
            if (Math.abs(point.getX() - points[i].getX()) <= delta
                    && Math.abs(point.getY() - points[i].getY()) <= delta)
            {
                // Match!
                return true;
            }
        }
        // No match
        return false;
    }
}
