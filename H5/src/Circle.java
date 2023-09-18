public class Circle implements Square {

    public double square(int... sides) {
        double CircleSquare = 0;
        double pi = 3.14;
        CircleSquare = 2 * pi * sides[0] * sides[0];

        return CircleSquare;
    }


    public static void main(String[] args) {

    }
}
