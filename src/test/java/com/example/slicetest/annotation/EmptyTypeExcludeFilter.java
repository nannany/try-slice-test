package com.example.slicetest.annotation;

import org.springframework.boot.test.autoconfigure.filter.StandardAnnotationCustomizableTypeExcludeFilter;

public class EmptyTypeExcludeFilter extends StandardAnnotationCustomizableTypeExcludeFilter<EmptyTest> {

    EmptyTypeExcludeFilter(Class<?> testClass) {
        super(testClass);
    }

}
