package com.yeamanan.projecttwo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * SampleTest class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class ProjectTwoTest {

    /**
     * test() test method.
     */
    @Test
    public final void test() {
        assertEquals("This is ok", ProjectTwo.write(),
                "This is a sample project");
    }
}
