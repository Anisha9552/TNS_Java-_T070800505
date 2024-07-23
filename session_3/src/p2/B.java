package p1.p2;

import static p1.A.fees;  // Import the static member fees from A
import static java.lang.System.out;

import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        out.println("Fees = " + fees);  // Use the static member fees
        out.println("Enter any character =");
        int i = System.in.read();
        System.out.println("i = " + i);
    }
}
