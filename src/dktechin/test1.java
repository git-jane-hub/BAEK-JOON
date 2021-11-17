package dktechin;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test1 {
	static String getRandomString(int i) {
		 byte[] bytearray = new byte[8];
		 String str;
		 StringBuffer buffer;
		 String alphabet;
		 
		 new Random().nextBytes(bytearray);
		 
		 str = new String(bytearray, Charset.forName("UTF-8"));
		 
		 buffer = new StringBuffer();
		 
		 alphabet = str.replaceAll("[^A-Za-z]", "");
		 
		 for(int a = 0; a < alphabet.length(); a++) {
			 if(Character.isLetter(alphabet.charAt(a)) && (i > 0)) {
				 buffer.append(alphabet.charAt(a));
				 i--;
			 }
		 }
		 return buffer.toString();
	}
	
	public static void main(String[] args) {
		
		// 1번 문제 시작
		Long startTime = System.currentTimeMillis();
		
		// 1번 문제
		HashMap map = new HashMap();
		final int STRINGLENGTH = 4;
		
		while(map.size() <= 7000000) {
			String ranStr = getRandomString(STRINGLENGTH);
			int ranNum = (int)(Math.random() * 9999) + 1;
			if(!map.containsKey(ranStr) && !ranStr.equals("")) {
				map.put(ranStr, ranNum);
			}
		}
		
		// 1번 문제 끝
		Long endTime = System.currentTimeMillis();
		System.out.println("1번 실행시간: " + (endTime - startTime)/1000.0 + "초\n");
		
		// 2번 문제 시작
		startTime = System.currentTimeMillis();
		
		// 2번 문제
		String inputStr = "ab";	// 찾으려는 문자열 입력 
		if(map.containsKey(inputStr)) {
			System.out.println("- 입력된 값");
			System.out.println(inputStr);
			System.out.println("- 추출된 값");
			System.out.println(map.get(inputStr));
		}
		
		// 2번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("2번 실행시간: " + (endTime - startTime)/1000.0 + "초\n");
		
		// 3번 문제 시작
		startTime = System.currentTimeMillis();
				
		// 3번 문제
		int inputInt = 2354;	// 찾으려는 숫자 입력
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		System.out.println("- 추출된 결과");
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			if((int)e.getValue() == inputInt) {
				System.out.print(e.getKey() + ", ");
			}
		}
		System.out.println();
		
		// 3번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("3번 실행시간: " + (endTime - startTime)/1000.0 + "초\n");
		
		// 4번 문제 시작
		startTime = System.currentTimeMillis();
		
		// 4번 문제
		inputStr = "qwe"; // 찾으려는 문자열 입력
		System.out.println("- 입력된 값");
		System.out.println(inputStr);
		String inputStrEach = "";
		int [] inputStrArr = new int[inputStr.length()];
		System.out.println("- 추출된 결과");
		for(int j = 0; j < inputStr.length(); j++) { 
			inputStrEach += inputStr.charAt(j) + "";
			inputStrArr[j] = (int)map.get(inputStrEach);
			System.out.println(inputStrEach + " -> " + inputStrArr[j]);
		}
		Arrays.sort(inputStrArr);
		IntStream.of(inputStrArr).boxed().collect(Collectors.groupingBy(i -> i))
			.entrySet()
			.stream()
			.filter(e -> e.getValue().size() >= 1)
			.forEach(e -> {
				System.out.println(e.getKey() + " : " + e.getValue()
				.stream()
				.collect(Collectors.counting()) + "개");
		});
		
		// 4번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("4번 실행시간: " + (endTime - startTime)/1000.0 + "초\n");
		
	}
	
}