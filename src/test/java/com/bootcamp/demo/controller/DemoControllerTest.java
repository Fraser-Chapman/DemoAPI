package com.bootcamp.demo.controller;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DemoControllerTest {

    private DemoController testSubject;

    @Before
    public void beforeEach() {
        testSubject = new DemoController();
    }

    @Test
    public void shouldReturnMessage() {
        assertThat(testSubject.demo().getMessage()).isEqualTo("Hello world!!!");
    }

}
