package pl.balcerek.functionalinterfaces;

public class Zad1 {

    public static void main(String[] args) {

        // pierwsza kropka
        Parabola parabola = new Parabola(1, -1, 5 / 4.0);
        double minArgument0 = FunDD.xminim(parabola, 0, 1);
        System.out.println(String.format("Parabola %s na przedziale [%s, %s] przyjmuje"
                        + " najmniejsza (w przyblirzeniu) wartosc dla argumentu: %s",
                parabola, 0, 1, minArgument0));

        // druga kropka
        double minArgument1 = FunDD.xminim(new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(Math.pow(x - 0.75, 2) + 1);
            }
        }, 0, 2);
        System.out.println(String.format("Anonimowa funkcja: Math.sqrt(Math.pow(x - 0.75, 2) + 1) "
                        + "mnna przedziale [%s, %s] przyjmuje"
                        + " najmniejsza (w przyblirzeniu) wartosc dla argumentu: %s",
                0, 2, minArgument1));

        // trzecia kropka
        double minArgument2 = FunDD.xminim(x -> x * x * (x - 2), 0, 2);
        System.out.println(String.format("Lambda: x -> x * x * (x - 2)"
                        + " na przedziale [%s, %s] przyjmuje"
                        + " najmniejsza (w przyblirzeniu) wartosc dla argumentu: %s",
                0, 2, minArgument2));
    }

}
