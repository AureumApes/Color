package io.aureumapes.color.polygon;

import io.aureumapes.color.WindowClosingAdapter;
import io.aureumapes.color.util.RandomColor;

import java.awt.*;

public class Polygons extends Frame {
    public Polygons() {
        super("Some Color");
        addWindowListener(new WindowClosingAdapter(true));
        setSize(1000, 1000);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        for (int i = 100; i > 0; --i){
            int[] arx = {(int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7)},
                    ary = {(int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7), (int) (Math.random() * 7)};
            for (int index = arx.length - 1; index > 0; --index) {
                arx[index] += (int) (Math.random() * 500 * i);
                ary[index] += (int) (Math.random() * 500 * i);
                g.setColor(new RandomColor().getColor());
                g.fillPolygon(arx, ary, arx.length);
            }
        }
    }
}
