package hashmap;
import java.util.*;

public class Emptyornot {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Black");
		map.put(2, "Blue");
		map.put(3, "Red");
		map.put(4, "Green");
		map.put(5, "Yellow");
		System.out.println("map1--"+map);
		map.clear();
		System.out.println("After clear elements"+map);
		boolean Result=map.isEmpty();
		System.out.println("map is Empty---"+Result);

	}

}
