package com.customer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FeatureXYZTest {

    @Test
    void verifyTransformToLower() {
        String text = FeatureXYZ.transformToCapital("text2");
        Assert.assertEquals("TEXT2", text);
    }

    @Test
    void verifyTransformToLowerNumbers() {
        String text = FeatureXYZ.transformToCapital("1234321");
        Assert.assertEquals("1234321", text);
    }

    @Test
    void verifyTransformToLowerSpecialChars() {
        String text = FeatureXYZ.transformToCapital("!@#$%^&*()Tt");
        Assert.assertEquals("!@#$%^&*()TT", text);
    }

    @Test
    void verifyTransformToLowerAllLowerLetters() {
        String text = FeatureXYZ.transformToCapital("hello world");
        Assert.assertEquals("HELLO WORLD", text);
    }
}
