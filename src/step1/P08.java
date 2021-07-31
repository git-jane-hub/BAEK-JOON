package step1;

import java.util.Arrays;
import java.util.Scanner;

/* 11720번 문제
 * 두 번에 나눠 숫자를 입력받음 
 * 첫 번째: 숫자의 개수 / 두 번째: 숫자 개수에 해당하는 숫자
 * 두 번째 받은 숫자를 더하여 출력 
 */
public class P08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 개수를 적어주세요.");
		int each = scan.nextInt();
		System.out.println("합을 구할 숫자를 적어주세요.");
		String sum = scan.next();
		char [] sumArr = sum.toCharArray();
		int result = 0;
		if(each == sumArr.length) {
			for(int a = 0; a < sumArr.length; a++) {
				System.out.println(sumArr[a]);
				result += Character.getNumericValue(sumArr[a]);
			}
		}else {
			System.out.println("숫자의 개수가 맞지 않습니다.");
			return;
		}
		System.out.println("숫자의 합: " + result);
	}
}
