package com.company.lessons.exceptions.lessonTask;

public class Converter {

    public static double convertToDol(double hrn) throws MoneyConvertException{

        if (hrn < 0) {
           throw new MoneyConvertException("sdsadas", hrn);
        }
        return hrn * 8;
    }

}
