package com.company.lessons;


import com.company.lessons.annotations.Author_Runtime;
import com.company.lessons.annotations.RandomClass;
import com.company.lessons.annotations.RandomClassChild;
import com.company.lessons.annotations.lessonTask.UserModel;
import com.company.lessons.annotations.userWithAgeTask.User;

import java.lang.annotation.Annotation;

public class LessonThreeEnv implements Startable{

//    @SuppressWarnings("deprecation")
    @Override
    public void start() {

        //*** Annotations ***///


        // **** Basic default annotations

//        @Deprecated @Override @SuppressWarnings
//        RandomClass randomClass = new RandomClass("Some field value");
//        System.out.println("Field: " + randomClass.getFieldOldMethod());


//        /**
//         * @deprecated please use {@link #existsByEventId(Long)} instead. Will be deleted after Dec 01, 2022
//         */
//        @Deprecated(since = "July 12, 2022")
//        boolean existsByEventIdAndAccount_AccountId(Long eventId, Long accountId);


        // **** Custom annotations

        // @interface, @Target, @Inherited, @Retention

        RandomClass randomClass = new RandomClass("Start value");

//
//        Annotation[] annotations = RandomClass.class.getAnnotations();    // RUNTIME доступаємось до анотації під час виконання програми за допомогою рефлексії
//        for (Annotation annotation : annotations) {
//            if (annotation instanceof Author_Runtime) {
//                Author_Runtime author = (Author_Runtime) annotation;
//                System.out.println("Author first name: " + author.firstName());
//                System.out.println("Author last name: " + author.lastName());
//            }
//        }

//        Author_Runtime childAnnotation = RandomClassChild.class.getAnnotation(Author_Runtime.class);   // @Inherited
//        System.out.println("Child annotation: " + childAnnotation);


        UserModel user = null;
        try {
            user = UserModel.createUser("James", 20);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("User name: " + user.getName());


        try {
            UserModel userTwo = UserModel.createUser("Taylor", 200);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("User name: " + user.getName());





        // **** TASK

//        User correctUser = User.createUser("James", 23);
//        System.out.println("User with correct age: " + correctUser.getAge());
//
//        User incorrectUser = User.createUser("Rob", 150);
//        System.out.println(incorrectUser.getAge());

    }

}
