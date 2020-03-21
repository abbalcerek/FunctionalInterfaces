package pl.balcerek.jwt;

import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {

    private ColComponent colComponent;

    public MyColorCompar(ColComponent colComponent) {
        this.colComponent = colComponent;
    }

    @Override
    public int compare(MyColor o1, MyColor o2) {

        switch(colComponent) {
            case RED:
                return Integer.compare(o1.getRed(), o2.getRed());
            case BLUE:
                return Integer.compare(o1.getBlue(), o2.getBlue());
            case GREEN:
                return Integer.compare(o1.getGreen(), o2.getGreen());
            default:
                throw new IllegalArgumentException("This will not happen. All enum values are exhausted.");
        }
    }
}
