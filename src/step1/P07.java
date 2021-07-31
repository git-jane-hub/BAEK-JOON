package step1;
import java.util.Arrays;
import java.util.Scanner;
/* 10809번 문제 - 다시
 * 알파벳 소문자로만 이루어진단어 S
 * a - z 를 숫자로 나열하는 데,
 * 해당 문자가 존재하면 위치를(0부터 시작), 존재하지 않으면 -1을 반
 */
public class P07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요.(소문자)");
		String voca = scan.next();
		char [] vocaArr = new char[voca.length()];
		for(int a = 0; a < vocaArr.length; a++) {
			vocaArr[a] = voca.charAt(a);
		}
		char [] alphabet = new char [26];
		for(int a = 0; a < alphabet.length; a++) {
			alphabet[a] = (char)(a + 97);
		}
		for(int b = 0; b < alphabet.length; b++) {
			for(int a = 0; a < vocaArr.length; a++) {
				if(Arrays.binarySearch(vocaArr, alphabet[b]) != -1) {
					System.out.println("a");
				}else {
					System.out.println(Arrays.binarySearch(alphabet, vocaArr[a]));
				}
			}
		}
	}
}
	
