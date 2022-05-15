package 방통대;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("one"); list.add("three");
	list.add("two"); list.add(3,"one"); //index 3번째 자리에 one 삽
	
	for(String s :list)
		System.out.println(s);

	}

}
