package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("111.55"));
        assertTrue(StringUtils.isPositiveNumber("0.01"));
        assertFalse(StringUtils.isPositiveNumber("-5"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber("abc"));
    }
}
