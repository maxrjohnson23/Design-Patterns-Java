package com.max.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Simple example of the Decorator pattern using the Java OutputStream
 */
public class DecoratorSimpleExample {

    public static void main(String[] args) throws Exception{
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);

        // FileOutputStream can write data using added functionality
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }

}
