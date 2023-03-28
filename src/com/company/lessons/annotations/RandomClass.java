package com.company.lessons.annotations;

import java.util.List;
import java.util.ArrayList;


@Author_Runtime(firstName = "Oleksii", lastName = "Babii")
public class RandomClass {

    private String field;

    public RandomClass(String field) {
        this.field = field;
    }

    @Deprecated
    public String getFieldOldMethod () {    // помічаємо цей метод, як застарілий
        return field;
    };

//    @SuppressWarnings("all")
    @SuppressWarnings("unchecked, rawtypes")
    @NeedRefactoring_Source(reason = "Method is being used with @SuppressWarnings")
    public List<String> getGenericList() { // приховуємо попередження
//        ArrayList<String> list = new ArrayList<String>();
        List list = new ArrayList();
        list.add(2);
        list.add("Second");
        list.add("Third");
        return list;
    }

    @Loggable_Class
    @SuppressWarnings("unused")
    public void doSomething() {
    }

    @Override
    public String toString() { // перевизначення методу toString
        return "ExampleClass{" +
                "oldField='" + field + '\'' +
                '}';
    }
}

