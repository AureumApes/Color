package io.aureumapes.color;

import io.aureumapes.color.circles.Circle;
import io.aureumapes.color.polygon.Polygons;
import io.aureumapes.color.rects.Rect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.print("Which forms do you want to use? (rects|circles|polygon): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        switch (type.toLowerCase(Locale.ROOT)) {
            case "rects" -> new Rect();
            case "circles" -> new Circle();
            case "polygon" -> new Polygons();
            default -> System.exit(0);
        }
    }
}
