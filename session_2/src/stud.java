public class stud {
	private int rollNo;
	private String name;
	private static String collegeName;
	private static int count;
	
	public stud() {}
	
	public stud(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", collegeName=" + collegeName + ", count=" + count
				+ "]";
	}
	
	public static int getcount()
	{
		return count;
	}
	
	static
	{
		System.out.println("In Static Block");
		count = 60;
		collegeName = "JSPM's BSIOTR";
	}
	
	public static void main(String [] args)
	{
		System.out.println("In Main Method");
	
		stud s1 = new stud (1, "Ankita");
		System.out.println("count=" + stud.getcount());
		stud s2 = new stud (2, "Anisha");
		System.out.println("count=" + stud.getcount());
		stud s3 = new stud (3, "Harshal");
		System.out.println("count=" + stud.getcount());
		
		System.out.println("count=" +stud.getcount());
	}
}