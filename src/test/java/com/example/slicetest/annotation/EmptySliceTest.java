package com.example.slicetest.annotation;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@EmptyTest
class EmptySliceTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void test() {
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
