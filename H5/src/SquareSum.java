public class SquareSum implements SquareTotal {


    public double SquareSum() {
        return t.square(3, 5) + c.square(3) + k.square(4, 4);
    }

    public static void main(String[] args) {
        SquareSum s = new SquareSum();
        System.out.println(s.SquareSum());
    }
}
