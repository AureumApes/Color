package io.aureumapes.color.rects;

import io.aureumapes.color.WindowClosingAdapter;

import java.awt.*;

public class Rect extends Frame {
    public Rect() {
        super("Some Color");
        addWindowListener(new WindowClosingAdapter(true));
        setBackground(Color.getColor(""));
        setSize(1000, 1000);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 700; i > 0; --i) {
            int x = (int) (Math.random() * 800), y = (int) (Math.random() * 800);
            int width = (int) (Math.random() * (200 + 100) - 100), height = (int) (Math.random() * (200 + 100) - 100);
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) ( Math.random() * 255);
            g.setColor(new Color(red, green, blue));
            g.fillRect(x, y, width, height);
        }
    }
}
