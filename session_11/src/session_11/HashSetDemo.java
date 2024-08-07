package session_11;
import java.util.LinkedHashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("a");
		h.add("10");
		h.add("Z");
		h.add(null);
		System.out.println(h.add("A"));
		System.out.println(h);
		System.out.println(h.size());
		h.remove("A");
		System.out.println(h);
	}

}
