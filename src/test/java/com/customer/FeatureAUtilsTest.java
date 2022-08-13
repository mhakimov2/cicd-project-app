package com.customer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeatureAUtilsTest {

    @Test
    void verifyTransformToLower() {
        String text = FeatureAUtils.transformToLower("TEXT2");
        Assert.assertEquals("text2", text);
    }

    @Test
    void verifyTransformToLowerNumbers() {
        String text = FeatureAUtils.transformToLower("1234321");
        Assert.assertEquals("1234321", text);
    }

    @Test
    void verifyTransformToLowerSpecialChars() {
        String text = FeatureAUtils.transformToLower("!@#$%^&*()Tt");
        Assert.assertEquals("!@#$%^&*()tt", text);
    }

    @Test
    void verifyTransformToLowerAllLowerLetters() {
        String text = FeatureAUtils.transformToLower("hello world");
        Assert.assertEquals("hello world", text);
    }
}
