package step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// P02 중복 제거 
public class P03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자의 개수를 적어주세요.");
		int N = scan.nextInt();
		System.out.println("기준이 되는 숫자를 적어주세요.");
		int X = scan.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		int num = 0;
		while(array.size() != N) {
			num = (int)(Math.random() * 10) + 1;
			if(!array.contains(num)) {
				array.add(num);
			}
		}
		System.out.println("숫자 모음: " + array);
		System.out.print("기준 숫자보다 작은 숫자 모음: ");
		for(int i = 0; i < (N - 1); i++) {
			if(array.get(i) < X) {
				System.out.print(array.get(i) + " ");
			}
		}
	}
}
