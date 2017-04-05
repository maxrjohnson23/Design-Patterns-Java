package com.max.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Simple example of the Facade pattern using the URL library
 */
public class FacadeSimpleExample {

    public static void main(String[] args) throws Exception {

        // URL is handling many activities on the backend, but make it simple for the client
        URL url = new URL("http", "www.google.com", 80, "/#q=test&*");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

    }

}
