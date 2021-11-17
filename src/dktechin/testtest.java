package dktechin;

public class testtest {
	public static void main(String[] args) {
		String inputStr = "qwe"; // 찾으려는 문자열 입력
		for(int j = 0; j < inputStr.length(); j++) { 
			String result = inputStr.charAt(j) + "";
			System.out.println(result);
		}
	}
}
