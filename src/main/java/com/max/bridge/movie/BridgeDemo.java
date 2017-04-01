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

        // MoviePrinter and PrintFormatter are completely independent of eachother
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

    }
}
