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
    public void emptyStringReturnsTrue() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("")));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void textInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchcode]"));
    }

    @Test
    public void oppositeBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchcode["));
    }

    @Test
    public void hasOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchcode"));
    }

    @Test
    public void twoClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]launchcode"));
    }

    @Test
    public void doubleBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[launchcode]]"));
    }

    @Test
    public void bracketInsideReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launch[code]"));
    }

    @Test
    public void bracketsAtBeginingReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launchcode"));
    }

    @Test
    public void closingBracketAtBeginingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchcode]"));
    }
    @Test
    public void closingBracketAndTwoClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]laucncode]["));
    }

    @Test
    public void oneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void opositeBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}