import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		Random rnd = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < 10000; i++) {
			int j = rnd.nextInt(30);
			
			Integer inc = map.get(j);
			map.put(j, inc != null ? inc + 1 : 1);
		}

		System.out.println(map);
	}
}