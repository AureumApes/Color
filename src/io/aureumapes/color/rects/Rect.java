package io.aureumapes.color.rects;

import io.aureumapes.color.WindowClosingAdapter;
import io.aureumapes.color.util.DataHolder;
import io.aureumapes.color.util.GenerateData;
import io.aureumapes.color.util.RandomColor;

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
        for (int i = 1000; i > 0; --i) {
            DataHolder holder = new DataHolder();
            int metricsMax = (200 + 100) - 100;
            int coordinatesMax = 1000;
            new GenerateData().generateMetrics(holder, metricsMax);
            new GenerateData().generateCoordinates(holder, coordinatesMax);

            g.setColor(new RandomColor().getColor());
            g.fillRect(holder.x - holder.width, holder.y - holder.height, holder.width, holder.height);
        }
    }
}
