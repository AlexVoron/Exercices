package com.vansoftware.exercices.exercice2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenBalanceCheckerTest {

    @Test
    public void checkBalance0() {
        assertTrue(ParenBalanceChecker.checkBalance(null));
    }
    @Test
    public void checkBalance1() {
        assertTrue(ParenBalanceChecker.checkBalance(""));
    }
    @Test
    public void checkBalance2() {
        assertTrue(ParenBalanceChecker.checkBalance("()"));
    }
    @Test
    public void checkBalance3() {
        assertTrue(ParenBalanceChecker.checkBalance("[]"));
    }
    @Test
    public void checkBalance4() {
        assertTrue(ParenBalanceChecker.checkBalance("{}"));
    }
    @Test
    public void checkBalance5() {
        assertTrue(ParenBalanceChecker.checkBalance("(()[{}]){[]}"));
    }
    @Test
    public void checkBalance6() {
        assertFalse(ParenBalanceChecker.checkBalance("("));
    }
    @Test
    public void checkBalance7() {
        assertFalse(ParenBalanceChecker.checkBalance(")"));
    }
    @Test
    public void checkBalance8() {
        assertFalse(ParenBalanceChecker.checkBalance("["));
    }
    @Test
    public void checkBalance9() {
        assertFalse(ParenBalanceChecker.checkBalance("]"));
    }
    @Test
    public void checkBalance10() {
        assertFalse(ParenBalanceChecker.checkBalance("{"));
    }
    @Test
    public void checkBalance11() {
        assertFalse(ParenBalanceChecker.checkBalance("}"));
    }

    @Test
    public void checkBalance12() {
        assertFalse(ParenBalanceChecker.checkBalance("{)"));
    }

    @Test
    public void checkBalance13() {
        assertFalse(ParenBalanceChecker.checkBalance("(]"));
    }

    @Test
    public void checkBalance14() {
        assertFalse(ParenBalanceChecker.checkBalance("[}"));
    }
}