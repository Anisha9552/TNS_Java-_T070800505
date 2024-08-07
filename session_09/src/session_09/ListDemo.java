package session_09;
import java.util.ArrayList;
public class ListDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("A");
		a.add('c');
		a.add(null);
		a.add(10);
		System.out.println(a);
		System.out.println(a.get(3));
		a.remove(3);
		System.out.println(a);
		a.add(3,50);
		System.out.println(a);
	}

}
