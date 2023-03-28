package com.company.lessons.annotations.lessonTask;

public class UserModel {

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    @AgeAnnotation(minAge = 10)
    private int age;

    public static UserModel createUser(String name, int age) throws NoSuchFieldException {
        if (validateAge(age)) {
            throw new RuntimeException();
        }
        return new UserModel(name, age);
    }

    private static boolean validateAge(int age) throws NoSuchFieldException {
        AgeAnnotation annotation = UserModel.class.getDeclaredField("age").getAnnotation(AgeAnnotation.class);
        int minAge = annotation.minAge();
        int maxAge = annotation.maxAge();
        return age < minAge || age > maxAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
