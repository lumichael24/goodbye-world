import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BuildOrder {

	public static void main(String[] args) {
		LinkedList<String> projects = new LinkedList<String>();
		projects.add("a");
		projects.add("b");
		projects.add("c");
		projects.add("d");
		projects.add("e");
		projects.add("f");
		TreeMap<String, String> dependencies = new TreeMap<String, String>();
		dependencies.put("a", "d");
		dependencies.put("f", "b");
		dependencies.put("b", "d");
		dependencies.put("f", "a");
		dependencies.put("d", "c");
		LinkedList<String> buildOrder = findBuildOrder(projects, dependencies);
		for (String s : buildOrder) {
			System.out.println(s);
		}
	}
	
	public static LinkedList<String> findBuildOrder(LinkedList<String> projects, 
			TreeMap<String, String> dependencies) {
		LinkedList<String> buildOrder = new LinkedList<String>();
		Set<String> setOfProjects = new TreeSet<String>();
		Set<String> keySet = dependencies.keySet();
		Set<String> entrySet = new TreeSet<String>();
		for (String key : keySet) {
			entrySet.add(dependencies.get(key));
		}
		for (String s : projects) {
			setOfProjects.add(s);
		}
		for (String s : projects) {
			if (!entrySet.contains(s)) {
				buildOrder.add(s);
				setOfProjects.remove(s);
			}
		}
		while (!setOfProjects.isEmpty()) {
			for (String first : buildOrder) {
				if (keySet.contains(first)) {
					buildOrder.add(dependencies.get(first));
					setOfProjects.remove(dependencies.get(first));
				}
			}
		}
		return buildOrder;
	}

}
