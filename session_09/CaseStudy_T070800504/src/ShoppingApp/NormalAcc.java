package ShoppingApp;

public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharge;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
        super(accNo, accNm, charges);
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Product booked with delivery charges: " + deliveryCharge);
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charge: " + deliveryCharge;
    }
}
