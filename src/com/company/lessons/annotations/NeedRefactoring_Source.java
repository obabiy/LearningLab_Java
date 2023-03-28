package com.company.lessons.annotations;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NeedRefactoring_Source {
    String reason();
}
