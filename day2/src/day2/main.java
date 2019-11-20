package day2;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Book[] a = {
				new Book("�Ѹ����б�",1,2010,3,15),
				new Book("IT ���",2,2018,8,11),
				new Book("�ڹ� ���α׷���",3,2011,1,1),
				new Book("C ���α׷���",4,1999,12,18),
				new Book("�ΰ�����",5,2019,2,22),
				new Book("����н�",6,2015,9,30),
				new Book("�ΰ��� �̷�",7,2017,5,21)
		};
		
		Arrays.sort(a);
		print(a,"(���ؾ���)");
		
		Arrays.sort(a,Book.WITH_NAME);
		print(a,"������");
		
		Arrays.sort(a,Book.WITH_SERIAL);
		print(a,"����������ȣ");
		
		Arrays.sort(a,Book.WITH_DATE);
		print(a,"�Ⱓ��");
	}
	public static void print(Book[] a,String key) {
		int i = 0;
		System.out.println("\n		"+key+"(��)�� ����");
		System.out.println("----------------------");
		for(Book temp : a) {
			System.out.print(temp.getTitle() + " " +temp.getSerial()
							+ " " +temp.getYyyy() +" " +temp.getMm()
							+" " +temp.getDd() +"\n");
		}
	}
}
