import java.awt.Frame;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test cases for the DrawFrame
 * 
 * @author CS2334
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrameTest
{
    private static Frame frame;

    /**
     * Setup
     */
    @BeforeClass
    public static void setUp()
    {
        frame = new DrawFrame("Meow :3");
    }

    /**
     * Save the frame to a file
     * 
     * @throws IOException
     */
    @Test
    public void test() throws IOException
    {
        Assert.assertNotNull(frame);
        PanelToImage.makePanelPNGImage(frame, "CatGenerated.png");
    }

}
