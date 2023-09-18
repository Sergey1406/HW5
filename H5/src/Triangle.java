public class Triangle implements Square {


    public double square(int... sides) {
        double TriangleSquare = 0;
        TriangleSquare = (sides[0] * sides[1]) / 2;

        return TriangleSquare;
    }

    public static void main(String[] args) {


    }
}
