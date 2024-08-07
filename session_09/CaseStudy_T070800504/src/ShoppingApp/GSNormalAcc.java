package ShoppingApp;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
        super(accNo, accNm, charges, deliveryCharge);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("GS Normal Account - Product booked with delivery charges.");
    }

    @Override
    public String toString() {
        return "GSNormalAcc: " + super.toString();
    }
}