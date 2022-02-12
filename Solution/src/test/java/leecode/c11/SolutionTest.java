package leecode.c11;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void maxArea0() {
        int[] heigh = new int[]{1,1};
        assertEquals(1,solution.maxArea(heigh));
    }
    @Test
    public void maxArea1() {
        int[] heigh = new int[]{4,3,2,1,4};
        assertEquals(16,solution.maxArea(heigh));

    }
    @Test
    public void maxArea2() {
        int[] heigh = new int[]{1,2,1};
        assertEquals(2,solution.maxArea(heigh));
    }

    @Test
    public void maxArea3() {
        int[] heigh = new int[]{1,8,6,2,5,4,8,3,7};
        assertEquals(49,solution.maxArea(heigh));
    }

    @Test
    public void maxArea4() {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        String[] strings = s.split(",");
        int[] heigh = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            heigh[i]=Integer.parseInt(strings[i]);
        }

        assertEquals(49,solution.maxArea(heigh));

    }
}