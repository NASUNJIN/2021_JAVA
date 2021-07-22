package sec01;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 문자열
 * @author 나선진
 *
 */
public class String3Demo {

	public static void main(String[] args) {
			String s1 = new String("Hi,");
			String s2 = new String(" Java");

			System.out.println("문자열 길이(s1) : " + s1.length());
			char c = s1.charAt(1);

			s1 = s1.concat(s2);

			System.out.println(s1.concat(s2) + "!");
			System.out.println(s1.toLowerCase() + "!");
			System.out.println(s1.substring(4,8) + "!");
			
			String s3 = " ";
			System.out.println(s3.isEmpty());
			System.out.println(s3.isBlank());
			
			String s4 = "";
			System.out.println(s4.isEmpty());
			System.out.println(s4.isBlank());
			
			String s5 ="*-*";
			System.out.println(s5.repeat(10));
			
			System.out.println(s2.trim().indexOf("v"));

	}

}
