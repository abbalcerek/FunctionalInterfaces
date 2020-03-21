package pl.balcerek.jwt;

import java.awt.*;

public class MyColor extends Color implements Comparable<MyColor> {

    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", getRed(), getGreen(), getBlue());
    }

    @Override
    public int compareTo(MyColor o) {
        return Integer.compare(this.getRed() + this.getGreen() + this.getBlue(),
                o.getRed() + o.getGreen() + o.getBlue());
    }
}
