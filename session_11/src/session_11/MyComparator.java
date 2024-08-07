package session_11;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return +1;
		else if(o1>02)
		return -1;
		else
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
