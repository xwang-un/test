package Junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 10177 on 2017/3/10.
 */
public class TestJunit {

    @Test
    public void addTest() {
        Assert.assertEquals(4,new Junit().add(2,2));
        Assert.assertEquals(3,new Junit().add(2,2));
    }
}
