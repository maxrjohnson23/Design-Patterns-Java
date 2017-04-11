package com.max.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Example showing the use of the Prototype pattern with an "expensive" Statement object
 */
public class PrototypeSimpleExample {

    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        // Record object is the same object on both instances (shallow copy).  This can be error prone
        System.out.println(secondStatement.getRecord());
    }

}
