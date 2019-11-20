package day2;
import java.util.*;

public class Book implements Comparable<Book>{

	public static final Comparator<Book> WITH_NAME = new WithName();
	public static final Comparator<Book> WITH_SERIAL = new WithSerial();
	public static final Comparator<Book> WITH_DATE = new WithDate();
	
	
	private String title;
	private int serial;
	private int yyyy;
	private int mm;
	private int dd;
	
	public Book(String titleIn, int serialIn, int yyyyIn, int mmIn, int ddIn) {
		title = titleIn;
		serial = serialIn;
		yyyy = yyyyIn;
		mm = mmIn;
		dd = ddIn;
	}
	public String getTitle() {return title;}
	public int getSerial() {return serial;}
	public int getYyyy() {return yyyy;}
	public int getMm() {return mm;}
	public int getDd() {return dd;}
	
	public static class WithName implements Comparator<Book>{
		public int compare(Book b1,Book b2) {
			return b1.title.compareTo(b2.title);
		}
	}
	public static class WithSerial implements Comparator<Book>{
		public int compare(Book b1,Book b2) {
			return b1.serial-b2.serial;
		}
	}
	public static class WithDate implements Comparator<Book>{
		public int compare(Book b1,Book b2) {
			if(b1.yyyy == b2.yyyy) {
				if(b1.mm == b2.mm) {
					return b1.dd-b2.dd;
				}
				else {
					return b1.mm-b2.mm;
				}
			}
			else {
				return b1.yyyy-b2.yyyy;
			}
		}
	}
	public int compareTo(Book b1) {
		return this.title.compareTo(b1.title);
	}
}
