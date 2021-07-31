package step1;

import java.util.Arrays;
import java.util.Scanner;

public class P09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("전화번호에 해당하는 문자를 입력하세요.");
		String voca = scan.next();
		char [] vocaChar = new char[voca.length()];
		int timeCount = 0;
		for(int a = 0; a < voca.length(); a++) {
			vocaChar[a] = voca.charAt(a);
		}
		for(int a = 0; a < voca.length(); a++) {
			if(vocaChar[a] >= (char)65 && vocaChar[a] <= (char)67) {
				timeCount += 3;
			}else if(vocaChar[a] >= (char)68 && vocaChar[a] <= (char)70) {
				timeCount += 4;
			}else if(vocaChar[a] >= (char)71 && vocaChar[a] <= (char)73) {
				timeCount += 5;
			}else if(vocaChar[a] >= (char)74 && vocaChar[a] <= (char)76) {
				timeCount += 6;
			}else if(vocaChar[a] >= (char)77 && vocaChar[a] <= (char)79) {
				timeCount += 7;
			}else if(vocaChar[a] >= (char)80 && vocaChar[a] <= (char)83) {
				timeCount += 8;
			}else if(vocaChar[a] >= (char)84 && vocaChar[a] <= (char)86) {
				timeCount += 9;
			}else if(vocaChar[a] >= (char)87 && vocaChar[a] <= (char)90) {
				timeCount += 10;
			}else {
				timeCount += 11;
			}
		}
		System.out.println(timeCount);
	}
}
