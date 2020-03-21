package pl.balcerek.functionalinterfaces;

@FunctionalInterface
interface FunDD {

    double fun(double x);

    static double xminim(FunDD f, double a, double b) {

        double interval = 1e-5;
        double currentXValue = a;

        double approximateMinValue = f.fun(a);
        double approximateMinArgument = a;

        while (currentXValue <= b) {
            if (f.fun(currentXValue) < approximateMinValue) {
                approximateMinValue = f.fun(currentXValue);
                approximateMinArgument = currentXValue;
            }
            currentXValue += interval;

        }

        return approximateMinArgument;
    }

}
