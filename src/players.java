import java.util.TreeMap;

public class players {
	
	private String name;
	private int sum;
	private int before;
	private TreeMap<Integer, Integer> ladder;
	private TreeMap<Integer, Integer> snakes;
	
	public players(String n) {
		name = n;
		sum = 0;
		before = 0;
		ladder = new TreeMap<Integer, Integer>();
		ladder.put(4, 25); ladder.put(13, 46); ladder.put(33, 49); ladder.put(42, 63);
		ladder.put(50, 69); ladder.put(62, 81); ladder.put(74, 92);
		snakes = new TreeMap<Integer, Integer>();
		snakes.put(99, 41); snakes.put(95, 77); snakes.put(89, 53); snakes.put(66, 45); 
		snakes.put(54, 31); snakes.put(43, 18); snakes.put(40,3); snakes.put(27, 5);
	}
	
	public String getName() {
		return name;
	}

	public int returnsum() {
		return sum;
	}
	
	public int editsum(int d) {
		before = sum;
		sum += d;
		return sum;
	}
	
	public boolean checksum() {
		if (sum > 100) {
			return true;
		}
		return false;
	}
	
	public int changesum() {
		return sum = before;
	}
	
	public boolean checkvicotry() {
		return sum == 100;
	}
	
	public boolean onladder() {
		if (ladder.get(sum) != null) {
			return true;
		}
		return false;
	}
	
	public void upaway() {
		sum = ladder.get(sum);
	}
	
	public boolean onsnake() {
		if (snakes.get(sum) != null) {
			return true;
		}
		return false;
	}
	
	public void downto() {
		sum = snakes.get(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
