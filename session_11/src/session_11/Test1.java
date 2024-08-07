package session_11;
import java.util.TreeSet;
public class Test1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);
	}

}
