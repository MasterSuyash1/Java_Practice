import java.util.Scanner;

class Rational {
    private int p;
    private int q;

    // Constructor
    public Rational(int p, int q) {
        this.p = p;
        this.q = q;
    }

    // Method to compute the product of two rational numbers
    public Rational product(Rational r) {
        int p3 = this.p * r.p;
        int q3 = this.q * r.q;
        return new Rational(p3, q3);
    }

    // Override toString() method to print output as p3/q3
    @Override
    public String toString() {
        return p + "/" + q;
    }
}

public class Sol7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting inputs p1, q1, p2, q2
        int p1 = scanner.nextInt();
        int q1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int q2 = scanner.nextInt();
        
        // Creating Rational objects
        Rational r1 = new Rational(p1, q1);
        Rational r2 = new Rational(p2, q2);
        
        // Computing the product of r1 and r2
        Rational r3 = r1.product(r2);
        
        // Printing the result
        System.out.println(r3);
    }
}
