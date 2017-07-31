import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by naduxa on 04.07.2017.
 */
public class SolutionTest {
    @org.testng.annotations.Test
    public void testSum() throws Exception {
        Assert.assertEquals(Solution.sum(1, 2),3);
        Assert.assertEquals(Solution.sum(2, 2),4);
    }

    @Test
    public void success() {

    }

    @Test(enabled = false)
    public void ignored0() {

    }

    @Test()
    public void ignored1() {
        throw new SkipException("Skipped");
    }


}