package io.aureumapes.color.util;

import java.awt.*;

public class RandomColor {
    private int r, g, b;
    private Color color;

    public RandomColor() {
        r = (int) (Math.random() * 255);
        g = (int) (Math.random() * 255);
        b = (int) (Math.random() * 255);
        color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }
}
