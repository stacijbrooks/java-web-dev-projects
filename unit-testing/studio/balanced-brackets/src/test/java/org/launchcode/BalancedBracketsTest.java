package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testOnlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testMultiplePairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode][Studio]"));
    }

    @Test
    public void testNonBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testNonBalancedBrackets2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testEmptyBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
}
