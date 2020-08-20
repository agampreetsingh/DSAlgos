package practice.AlgorithmsAndDS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Long> checkList = new ArrayList<>();
		checkList.add(2L);
		checkList.add(3L);
		checkList.add(9L);
		checkList.add(5L);
		checkList.add(33L);
		checkList.add(1L);
		Iterator<Long> iterator = checkList.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator);
		iterator.next();
			}
		System.out.println(checkList.size());
		
		for(Long checkIt: checkList) {
			System.out.println(checkIt);
		}
		
		//fibonacci(0,1,10);
	}

	public static void fibonacci(int prev, int curr, int end) {
		if(curr == 1 && prev ==0 ) {
			System.out.print(prev+" "+curr+" ");
		}
		if(end == 0) {
			System.out.print(prev+curr + " ");
			return;
		}
		System.out.print(curr + prev + " ");
		fibonacci(curr, curr+prev, end-1);
		
	}
}
