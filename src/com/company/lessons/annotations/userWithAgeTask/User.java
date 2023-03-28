package com.company.lessons.annotations.userWithAgeTask;

import java.lang.reflect.Field;

public class User {
    private String name;

    @Age(minAge = 18, maxAge = 60)
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User createUser(String name, int age) throws IllegalArgumentException {
        try {
            Field field = User.class.getDeclaredField("age");
            Age ageAnnotation = field.getAnnotation(Age.class);
            int minAge = ageAnnotation.minAge();
            int maxAge = ageAnnotation.maxAge();

            if (age < minAge || age > maxAge) {
                throw new IllegalArgumentException("Age should be between " + minAge + " and " + maxAge);
            }

            return new User(name, age);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
