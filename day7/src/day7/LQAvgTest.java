package day7;

public class LQAvgTest {
	public static void main(String []args) {
		LQAvg<Integer> a = new LQAvg<Integer>();
		
		int q[] = {1,2,3,4,5};
		for (int i = 0; i < q.length; i++) {
			a.add(q[i]);
		}
		a.print();
		System.out.println("ЦђБе >>" + a.avg());
		a.print();
	}
}
