import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortValue {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Bala");
		map.put(2, "Priya");
		map.put(3, "Josue");
		map.put(4, "Anu");
		
		Map<Integer, String> sortedMap = map.entrySet()
											.stream()
											.sorted(Entry.comparingByValue())
											.collect(Collectors.toMap(Entry::getKey, Entry::getValue,
													 (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedMap);				
	}
}
