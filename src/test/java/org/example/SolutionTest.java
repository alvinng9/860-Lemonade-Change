package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lemonadeChangeTest() {
        Solution solution = new Solution();
        assertTrue(solution.lemonadeChange(new int[]{5,5,5,10,20}));
        assertFalse(solution.lemonadeChange(new int[]{5,5,10,10,20}));
    }
}