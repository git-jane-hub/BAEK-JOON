package step1;

import java.util.Arrays;
import java.util.Scanner;
/* 정수 N개로 이루어진 수열 A 와 정수 X		
 * A에서 X보다 작은 수를 출력하는 프로그램 작성 
 * N과 X의 범위는 1에서 10사이 
 */
public class P02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자의 개수를 적어주세요.");
		int N = scan.nextInt();
		System.out.println("기준이 되는 숫자를 적어주세요.");
		int X = scan.nextInt();
		int [] array = new int [N];
		for(int i = 0; i < (N - 1); i++) {
			array[i] = (int)(Math.random() * 10) + 1;
		}
		System.out.println("숫자 모음: " + Arrays.toString(array));
		System.out.print("기준 숫자보다 작은 숫자 모음: ");
		for(int i = 0; i < (N - 1); i++){
			if(array[i] < X) { 
				System.out.print(array[i] + "  ");
			}
		}
	}
}
