package day7;

public class AnimalShelterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalShelter<String> an = new AnimalShelter<String>();
		
		String [][] ani = { {"Brad","Dog"},{"Tom","Dog"},{"Cindy","Cat"},
							{"Jake","Dog"},{"Jenny","Cat"},{"Alex","Dog"},
							{"Lucy","Cat"},{"Maggie","Cat"} };
		for (int i = 0; i < 8;i++) {
			an.Enter(ani[i]);
		}
		an.print();
		
		an.adoptAny();
		an.print();

		an.adoptCat();
		an.print();

		an.adoptDog();
		an.print();
		
		an.adoptAny();
		an.print();
		
		an.adoptDog();
		an.print();
	}

}
