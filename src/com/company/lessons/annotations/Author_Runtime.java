package com.company.lessons.annotations;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author_Runtime {
    String firstName() default "Admin";
    String lastName() default "Admin";
}
