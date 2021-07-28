package step1;

import java.util.Arrays;
import java.util.Scanner;

public class R06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] number = new int [9];
		System.out.println("1부터 100사이의 9개의 숫자를 입력해주세요.");
		for(int a = 0; a < 9; a++) {
			number[a] = scan.nextInt();
			if(number[a] < 100 && number[a] > 0) {
			}else {
				System.out.println("범위(1부터 100사이)에 맞는 숫자를 입력하세요.");
				return;
			}
		}
		int max = 0;
		for(int b = 0; b < number.length; b++) {
			if(max < number[b]) {
				max = number[b];
			}
		}
		System.out.println("최대값: " + max);
		for(int c = 0; c < number.length; c++) {
			if(max == number[c]) {
				System.out.println("최대값의 자리수: " + (c + 1));
			}
		}
	}
}
