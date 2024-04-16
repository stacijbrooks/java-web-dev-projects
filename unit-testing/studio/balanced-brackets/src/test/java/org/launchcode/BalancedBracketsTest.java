package org.launchcode; // Declares the package of the class.

import org.junit.jupiter.api.Test; // Imports the Test class from JUnit.

import static org.junit.jupiter.api.Assertions.*; // Imports static methods for assertions.

class BalancedBracketsTest { // Defines the class BalancedBracketsTest.
    //TODO: add tests here

    @Test
    public void emptyTest() { // Begins a test method named emptyTest.
        assertEquals(true, true); // Asserts that true equals true.
    }

    @Test
    public void testEmptyString() { // Begins a test method named testEmptyString.
        assertTrue(BalancedBrackets.hasBalancedBrackets("")); // Asserts that an empty string has balanced brackets.
    }

    @Test
    public void testOnlyBrackets() { // Begins a test method named testOnlyBrackets.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); // Asserts that brackets "[]" are balanced.
    }

    @Test
    public void testNestedBrackets() { // Begins a test method named testNestedBrackets.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]")); // Asserts that nested brackets "[[]]" are balanced.
    }

    @Test
    public void testMultiplePairs() { // Begins a test method named testMultiplePairs.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode][Studio]")); // Asserts that multiple pairs of brackets are balanced.
    }

    @Test
    public void testNonBalancedBrackets() { // Begins a test method named testNonBalancedBrackets.
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode")); // Asserts that unbalanced brackets "[LaunchCode" return false.
    }

    @Test
    public void testNonBalancedBrackets2() { // Begins a test method named testNonBalancedBrackets2.
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); // Asserts that unbalanced brackets "Launch]Code[" return false.
    }

    @Test
    public void testEmptyBracket() { // Begins a test method named testEmptyBracket.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); // Asserts that empty brackets "[]" are balanced.
    }

    @Test
    public void testNoBrackets() { // Begins a test method named testNoBrackets.
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode")); // Asserts that a string without brackets returns true.
    }

    @Test
    public void testNestedMultipleLevels() { // Begins a test method named testNestedMultipleLevels.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]")); // Asserts that multiple levels of nested brackets are balanced.
    }

    @Test
    public void testBracketsAndOtherCharacters() { // Begins a test method named testBracketsAndOtherCharacters.
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]")); // Asserts that brackets with other characters are balanced.
    }

    @Test
    public void testBracketsInDifferentPositions() { // Begins a test method named testBracketsInDifferentPositions.
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]")); // Asserts that brackets in different positions are balanced.
    }

    @Test
    public void testMixOfBracketsAndNonBrackets() { // Begins a test method named testMixOfBracketsAndNonBrackets.
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code[")); // Asserts that a mix of brackets and non-bracket characters are not balanced.
    }
}
