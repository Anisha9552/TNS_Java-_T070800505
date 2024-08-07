package ShoppingApp;

public class GSPrimeAcc  extends PrimeAcc {
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("GS Prime Account - Product booked with no delivery charges.");
    }

    @Override
    public String toString() {
        return "GSPrimeAcc: " + super.toString();
    }
}