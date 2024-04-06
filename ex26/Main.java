// Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West). 


public class Main {
	public enum Direction {
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	
	public static void main(String[] args) {
		Direction head1 = Direction.NORTH;
		Direction head2 = Direction.EAST;
		System.out.println("First direction: " + head1);
		System.out.println("Second direction: " + head2);
	}
}

