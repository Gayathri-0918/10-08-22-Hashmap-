package hashmap;
import java.util.*;

public class AddmapElements {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Black");
		map.put(2, "Blue");
		map.put(3, "Red");
		map.put(4, "Green");
		map.put(5, "Yellow");
		System.out.println("Map1--"+map);
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(6, "orange");
		map2.put(7, "white");
		System.out.println("Map2"+map2);
		map2.putAll(map);
		System.out.println("Adding elements"+map);
		

	}

}
