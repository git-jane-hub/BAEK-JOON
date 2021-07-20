package step1;

import java.util.Scanner;

/*  Question: 사분면 고르기
 * 	점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램 작성 
 */

public class P01 {
	public static void dontInsertZero() {
		System.out.println("0은 입력할 수 없습니다.");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x축 숫자를 입력하세요.");
		int x = scan.nextInt();
		System.out.println("y축 숫자를 입력하세요.");
		int y = scan.nextInt();
		
		if(x > 0) {
			if(y == 0) {
				dontInsertZero();
			}
			else if(y > 0) {
				System.out.println("제 1사분면에 속합니다.");
			}else {
				System.out.println("제 4사분면에 속합니다.");
			}
		}else if (x < 0){
			if(y == 0) {
				dontInsertZero();
			}
			else if(y > 0) {
				System.out.println("제 2사분면에 속합니다.");
			}else {
				System.out.println("제 3사분면에 속합니다.");
			}
		}else {
			dontInsertZero();
		}
	}
}
