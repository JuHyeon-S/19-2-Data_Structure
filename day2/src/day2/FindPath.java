package day2;

public class FindPath {

	public static void main(String[] args) {
		int[][] map1 = {{ 0 , 100, 0},
						{100,  10, 0},
						{ 10,   0, 0}}; //길있음
		int[][] map2 = {{ 0 ,1000, 0},
						{100,  10, 0},
						{ 10,   0, 0}}; //길없음
		final int nRow = 3;
		final int nCol = 3;
		
		int startX = 0;
		int startY = 2;
		int endX = 2;
		int endY = 0;

		System.out.println("-----map1");
		if (findpath(map1,nRow, nCol,startX, startY, endX, endY) > 0) System.out.println("Found a path!");
		else System.out.println("There is no path");
		
		System.out.println("\n-----map2");
		if (findpath(map2,nRow, nCol,startX, startY, endX, endY) > 0) System.out.println("Found a path!");
		else System.out.println("There is no path");
	}
	public static int findpath(int[][] map, int nRow, int nCol,
				int startX, int startY, int endX, int endY) {

		if (startX == endX && startY == endY) return 1;
		if (startX < 0 || startX >= nCol) return 0;
		if (startY < 0 || startY >= nRow) return 0;
		
		
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		
		if (map[startY][startX] == 1000) //left
			r1 = findpath(map,nRow, nCol,startX-1, startY, endX, endY);
		if (map[startY][startX] == 100) //right
			r2 = findpath(map,nRow, nCol,startX+1, startY, endX, endY);
		if (map[startY][startX] == 10)  //up
			r3 = findpath(map,nRow, nCol,startX, startY-1, endX, endY);
		if (map[startY][startX] == 1)   //down
			r4 = findpath(map,nRow, nCol,startX, startY+1, endX, endY);
		
		return r1 + r2 + r3 + r4;
	}
}