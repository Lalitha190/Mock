package duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,4,3,2,1);
		Set<Integer> duplicates=new HashSet<>();
	Set<Integer>	dup=list.stream().filter(e->(!duplicates.add(e))).collect(Collectors.toSet());
	System.out.println(dup);
	}

}
