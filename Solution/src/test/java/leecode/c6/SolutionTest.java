package leecode.c6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution ;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void convert1() {
        assertEquals("PAHNAPLSIIGYIR",solution.convert("PAYPALISHIRING",3));
    }
    @Test
    public void convert2() {
        assertEquals("PINALSIGYAHRPI",solution.convert("PAYPALISHIRING",4));
    }

}