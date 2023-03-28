package com.company.lessons.annotations.lessonTask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AgeAnnotation {
    int minAge() default 18;
    int maxAge() default 110;
}
