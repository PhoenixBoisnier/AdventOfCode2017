
public class Day3 {
	
	public static void main(String[] args) {

		int n = 289326;
		int numsLeft = n-((Day3.minLength(n)-1)*(Day3.minLength(n)-1));
		System.out.println(numsLeft);
		while(numsLeft>Day3.minLength(n)) {
			numsLeft-=Day3.minLength(n);
			System.out.println(numsLeft);
		}
		numsLeft-=Day3.minLength(n)/2;
		System.out.println(numsLeft);
		System.out.println("Half length of square formed: "+Day3.minLength(n)/2);
		System.out.println(Day3.minLength(n)/2+numsLeft);
		System.out.println();
		
		//part2
		int[][] arr = new int[500][500];
		Pointer points = new Pointer(arr);
		points.setData(1);
		points.moveEast();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		points.moveNorth();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		points.moveWest();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		points.moveWest();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		points.moveSouth();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		points.moveSouth();
		points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
		while(Day3.totalNeighbors(points.world, points.x, points.y)<n) {
			while(points.shouldMoveEast()) {
				if(Day3.totalNeighbors(points.world, points.x, points.y)>n) {
					break;
				}
				points.moveEast();
				points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
			}
			while(points.shouldMoveNorth()) {
				if(Day3.totalNeighbors(points.world, points.x, points.y)>n) {
					break;
				}
				points.moveNorth();
				points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
			}
			while(points.shouldMoveWest()) {
				if(Day3.totalNeighbors(points.world, points.x, points.y)>n) {
					break;
				}
				points.moveWest();
				points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
			}
			while(points.shouldMoveSouth()) {
				if(Day3.totalNeighbors(points.world, points.x, points.y)>n) {
					break;
				}
				points.moveSouth();
				points.setData(Day3.totalNeighbors(points.world, points.x, points.y));
			}
		}
		System.out.println(points.getVal());
		

	}
	
	public static int minLength(int n) {
		for(int i = 0; i<n; i++) {
			if(i*i>=n) {
				return i;
			}
		}
		return 0;
	}
	
	public static int sizeContaining(int n) {
		for(int i = 1; i<=n; i++) {
			if(i*i>=n) {
				return i;
			}
		}
		return 0;
	}

	public static int totalNeighbors(int[][] arr, int x, int y) {
		return arr[x+1][y+1]+arr[x][y+1]+arr[x-1][y+1]+arr[x+1][y-1]
				+arr[x][y-1]+arr[x-1][y-1]+arr[x+1][y]+arr[x-1][y];
	}
	
	public static class Pointer{
		int x;
		int y;
		int[][] world;
		public Pointer(int[][] arr) {
			world = arr;
			x = world.length/2;
			y = world.length/2;
		}
		
		public void setData(int val) {
			world[x][y] = val;
		}
		public void moveEast() {
			x++;
		}
		public void moveNorth() {
			y--;
		}
		public void moveWest() {
			x--;
		}
		public void moveSouth() {
			y++;
		}
		public boolean shouldMoveEast() {
			if(world[x][y-1]!=0) {
				return true;
			}
			else return false;
		}
		public boolean shouldMoveNorth() {
			if(world[x-1][y]!=0) {
				return true;
			}
			else return false;
		}
		public boolean shouldMoveWest() {
			if(world[x][y+1]!=0) {
				return true;
			}
			else return false;
		}
		public boolean shouldMoveSouth() {
			if(world[x+1][y]!=0) {
				return true;
			}
			else return false;
		}
		public int getVal() {
			return world[x][y];
		}
	}
}
