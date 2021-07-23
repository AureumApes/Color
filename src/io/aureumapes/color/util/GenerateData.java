package io.aureumapes.color.util;

public class GenerateData {
    public GenerateData() {
    }

    public void generateCoordinates(DataHolder holder, int max) {
        holder.setX(generateInt(max));
        holder.setY(generateInt(max));
    }

    public void generateMetrics(DataHolder holder, int max) {
        holder.setHeight(generateInt(max));
        holder.setWidth(generateInt(max));
    }


    int generateInt(int max) {
        return ((int) (Math.random() * max));
    }
}

