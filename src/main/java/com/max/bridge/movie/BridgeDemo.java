package com.max.bridge.movie;

/**
 * Created by Max on 4/1/2017.
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("Terminator");
        movie.setRuntime("1:48");
        movie.setYear("1984");

        // MoviePrinter and and Formatter implementations are completely independent of each other
        Printer moviePrinter = new MoviePrinter(movie);

        Formatter printFormatter = new PrintFormatter();
        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        // Add new type of formatter without modifying MoviePrinter
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);

    }
}
