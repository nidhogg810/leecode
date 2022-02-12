package kmp;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KmpAlgoTest {
    KmpAlgo kmpAlgo;

    @Before
    public void setUp() throws Exception {
        kmpAlgo = new KmpAlgo();
    }

    @Test
    public void calPartialMatchedTable() {
        String p = "ABCDABD";

//        System.out.println(Arrays.toString(kmpAlgo.calPartialMatchedTable(p)));
        String s = "ACADABECDABDABCDABD";
        System.out.println(kmpAlgo.kmp(s,p));
    }
}