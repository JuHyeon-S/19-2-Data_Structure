package day2;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Book[] a = {
				new Book("한림대학교",1,2010,3,15),
				new Book("IT 기술",2,2018,8,11),
				new Book("자바 프로그래밍",3,2011,1,1),
				new Book("C 프로그래밍",4,1999,12,18),
				new Book("인공지능",5,2019,2,22),
				new Book("기계학습",6,2015,9,30),
				new Book("인간의 미래",7,2017,5,21)
		};
		
		Arrays.sort(a);
		print(a,"(기준없음)");
		
		Arrays.sort(a,Book.WITH_NAME);
		print(a,"도서명");
		
		Arrays.sort(a,Book.WITH_SERIAL);
		print(a,"도서고유번호");
		
		Arrays.sort(a,Book.WITH_DATE);
		print(a,"출간일");
	}
	public static void print(Book[] a,String key) {
		int i = 0;
		System.out.println("\n		"+key+"(으)로 정렬");
		System.out.println("----------------------");
		for(Book temp : a) {
			System.out.print(temp.getTitle() + " " +temp.getSerial()
							+ " " +temp.getYyyy() +" " +temp.getMm()
							+" " +temp.getDd() +"\n");
		}
	}
}
