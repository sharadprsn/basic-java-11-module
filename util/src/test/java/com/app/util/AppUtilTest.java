package com.app.util;

import org.junit.jupiter.api.*;

class AppUtilTest {

    static AppUtil appUtil;

    @BeforeEach
    void setUp() {
        appUtil = new AppUtil();
    }

    @AfterEach
    void tearDown() {
        appUtil = null;
    }

    @Test
    void toUpper() {
        Assertions.assertEquals("HELLO",appUtil.toUpper("hello"));
    }
}