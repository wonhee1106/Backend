package exam;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Exam01 {
	public static String getSHA512(String input){
	      String toReturn = null;
	      try {
	          MessageDigest digest = MessageDigest.getInstance("SHA-512");
	          digest.reset();
	          digest.update(input.getBytes("utf8"));
	          toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
	      } catch (Exception e) {
	          e.printStackTrace();
	      }
	      return toReturn;
	    }
	public static void main(String[] args) {
		String text = getSHA512("송아지");
		System.out.println(text);
		
		// 암호화
		
		// 양방향 암호화 : 암호화 및 복호화가 둘다 가능한 경우
		
		// 단방향 암호화 : 암호화는 가능하나 복호화는 불가능한 경우
		// - MD5 : 과거 단방향 암호화에 쓰이는 기법이었으나, 암호화 무결성 깨짐 때문에 더 이상 사용하지 않음.
		// - 대안으로 SHA256 ~ SHA512 를 사용함 
	}
}
