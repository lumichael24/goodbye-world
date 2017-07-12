import java.util.ArrayList;

public class PowerSet {
	public static void main(String[] args) {
		
	}
	public static ArrayList<ArrayList<Integer>> generate(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allsubsets;
		if (set.size() == index) {
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
			return allsubsets;
		}
		else {
			allsubsets = generate(set, index + 1); 
			int data = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subset : allsubsets) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(data);
				moresubsets.add(newsubset);
				
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
}
