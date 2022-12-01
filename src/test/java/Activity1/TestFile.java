package Activity1;

import org.junit.Assert;
import org.junit.Test;

public class TestFile {

    @Test
    public void multiply(){
        int actualValue = 2*9;
        int expectedValue = 18;

        Assert.assertEquals(expectedValue, actualValue);
    }
}
