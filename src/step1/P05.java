package step1;
import java.util.Scanner;
/* 1110번 문제
 * 더하기 사이클 -- 다시 
 */
public class P05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0에서 99 사이의 정수를 입력해주세요.");
		int num = scan.nextInt();	// 입력 받은 값 
		//int numSave = num;			// 초기 값 
		int numTen = 0;				// 십의 자리 
		int numOne = 0;				// 일의 자리 
		int one = 0;
		int result = 0;				// 마지막 비교 값 
		int count = 0;				// 사이클 횟수 카운트 
		while(num != result) {
			count++;
			if(num >= 0 && num <= 99) {
				if(num < 10) {
					numTen = 0;
					numOne = num;	
				}else if(num >= 10) {
					numTen = (int)(Math.floor(num * 0.1));
					numOne = num - (numTen * 10);
				}
			one = numOne;
			num = numTen + numOne;
			}else {
				System.out.println("범위에 맞는 수를 입력해주세요.");
				return;
			}
			result = (one * 10) + numOne;
		}
		System.out.println("사이클 횟수: " + count);
//		int circle = 0;
//		int circleNumOne = 0;
//		int circleNumTen = 0;
//		while(num != result) {
//			circle = numTen + numOne;
//			if(circle < 10) {
//				circleNumTen = 0;
//				circleNumOne = circle;
//			}else if(circle >= 10) {
//				circleNumTen = (int)(Math.floor(circle * 0.1));
//				circleNumOne = circle - (circleNumTen * 10);
//			}
//			result = numOne
	}
}