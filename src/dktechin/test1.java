package dktechin;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class test1 {
	static String getRandomString(int i) {
		 byte[] bytearray = new byte[8];	// 문자열 최대 바이트 
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
		 return buffer.toString();	// 생성만
	}
	
	public static void main(String[] args) {
		
		// 1번 문제 시작
		Long startTime = System.currentTimeMillis();
		
		// 1번 문제
		HashMap map = new HashMap();
		int i = 4;	// 문자열 길이
		
		while(map.size() <= 70) {	// 70000으로 변경 
			String ranStr = getRandomString(i);
			int ranNum = (int)(Math.random() * 9999) + 1;
			if(!map.containsKey(ranStr) && ranStr != "") {
				map.put(ranStr, ranNum);
			}
		}
		
		// 1번 문제 끝
		Long endTime = System.currentTimeMillis();
		System.out.println("1번 실행시간: " + (endTime - startTime)/1000.0 + "초");
		
		// 2번 문제 시작
		startTime = System.currentTimeMillis();
		
		// 2번 문제
		String inputStr = "ab";	// 찾으려는 문자열 입력 
		if(map.containsKey(inputStr)) {
			System.out.println("추출된 값: " + map.get(inputStr));
		}
		// 2번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("2번 실행시간: " + (endTime - startTime)/1000.0 + "초");
		
		/*
		HashMap map = new HashMap();
		map.put("qwe", 243);
		map.put("asd", 2354);
		map.put("ss", 2354);
		*/
		// 3번 문제 시작
		startTime = System.currentTimeMillis();
				
		// 3번 문제
		int inputInt = 2354;	// 찾으려는 숫자 입력
		
		Set set = map.entrySet();	// 모든 값을 가져옴
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			if((Integer)e.getValue() == inputInt) {
				System.out.println("추출된 결과: " + e.getKey());	// 첫 값일 경우 못가져옴
			}
			
		}
		
		if(map.containsValue(inputInt)) {
			System.out.println("다음 숫자에 매칭되어있는 문자열 추출: " + map.get(inputInt));
		}
		
		// 3번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("3번 실행시간: " + (endTime - startTime)/1000.0 + "초");
		
		// 4번 문제 시작
		startTime = System.currentTimeMillis();
		
		// 4번 문제
		inputStr = "qwe"; // 찾으려는 문자열 입력
		for(int j = 0; j < inputStr.length(); j++) { 	// 한문자씩 분리하고(이거됨) 하나씩 더해야하는데 그게 안됨,,,,
			String result = inputStr.charAt(j) + "";
			System.out.println(result);
		}
		
		// 4번 문제 끝
		endTime = System.currentTimeMillis();
		System.out.println("4번 실행시간: " + (endTime - startTime)/1000.0 + "초");
		
	}
}
