package ShoppingApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShopFactory shopFactory = new GSShopFactory();

	        PrimeAcc primeAccount = shopFactory.getNewPrimeAccount(101, "John Doe", 500, true);
	        NormalAcc normalAccount = shopFactory.getNewNormalAccount(102, "Jane Smith", 500, 50);

	        // Test Prime Account
	        primeAccount.bookProduct(200);
	        System.out.println(primeAccount);

	        // Test Normal Account
	        normalAccount.bookProduct(200);
	        System.out.println(normalAccount);
	}

}
