package session_11;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("A");
		t.add("a");
		t.add("H");
		t.add("Z");
		t.add("B");
		//t.add(10);//ClassCastException
		//t.add(null);//NullPointException
		System.out.println(t);
		//Default Sorting Order-Ascending Order
	}

}
