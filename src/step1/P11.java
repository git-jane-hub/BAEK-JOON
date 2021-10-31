package step1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 4673번 셀프넘버 
public class P11 {
	public static int d(int n) {
		int result = n;
		while(n != 0) {
			result = result + (n % 10);
			n = n / 10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(d(51));
		
/*
		List<Integer> nums = new ArrayList<>();
		for(int a = 0; a < 10000; a++) {
			nums.add(d(a));	
		}
		List<Integer> selfs = new ArrayList<>();

		for(int a = 0; a < 10000; a++) {
			if(!nums.contains(a)) {
				selfs.add(a);
			}
		}
		Collections.sort(selfs);
		
		for(int a = 0; a < selfs.size(); a++) {
			System.out.println(selfs.get(a));
		}
*/			
	}

}
