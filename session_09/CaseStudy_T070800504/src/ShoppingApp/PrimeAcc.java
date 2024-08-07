package ShoppingApp;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Product booked with no delivery charges for Prime Account");
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Prime: " + isPrime;
    }
}
