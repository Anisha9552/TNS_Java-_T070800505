package ShoppingApp;

public abstract class ShopAcc {
	private int accNo ;
	private String accNm;
	private float charges ;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges) {
        System.out.println("Product booked with charges: " + charges);
    }
	
//	public void items(float);
	
	
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
	


	

}
