package step1;
import java.util.Scanner;
// 45분 이르게 알람맞추기 
public class P04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시간을 입력해주세요.");
		int H = scan.nextInt();
		System.out.println("분을 입력해주세요.");
		int M = scan.nextInt();
		System.out.println("입력한 시간은 " + H + "시 " + M +"분 입니다.");
		int hh = 0;
		int mm = 0;
		if((H <= 24) && (H >= 0)) {
			
			if((M <= 59) && (M >= 0)) {
				if(M - 45 > 0) {
					hh = H;
					mm = (M - 45 );
				}else {
					int gap = (45 - M);
					mm = (60 - gap);
					hh = (H - 1);
					if(H - 1 < 0) {
						hh = (H + 24) - 1;
					}
				}
			}else {
				System.out.println("범위에 맞는 분을 입력하세요.");
				return;
			}
			
		}else {
			System.out.println("범위에 맞는 시간을 입력하세요.");
			return;
		}
		System.out.println("알람을 맞춰야 할 시간은 45분 이른, " + hh + "시 " + mm + "분 입니다.");
	}
}
