package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("10"));
        assertTrue(StringUtils.isPositiveNumber("0.01"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-0.01"));
        assertFalse(StringUtils.isPositiveNumber("-10"));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber(null));
        assertFalse(StringUtils.isPositiveNumber("abc"));
    }
}
