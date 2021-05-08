package doorProject;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Door> doors = new ArrayList<Door>();
	
	public static void main(String[] args) {
		DoorManager doorManager = new DoorManager();
		doorManager.add(new Door(0, "Type-1", false, 3));
		doorManager.add(new Door(1, "Type-2", true, 2));
		doorManager.add(new Door(2, "Type-3", false, 5));
		
		printDoors();
		doorManager.delete(doors.get(2));
		printDoors();
		
		printDoors();
		doorManager.closeDoor(doors.get(1));
		doorManager.openDoor(doors.get(0));
		printDoors();
	}
	
	public static void printDoors() {
		for (Door door : doors) {
			System.out.println("----------------");
			System.out.println("Door Id: " + door.id);
			System.out.println("Door Type: " + door.typeOfDoor);
			System.out.println("Is Door Open?: " + door.isOpen);
			System.out.println("Number of Locks: " + door.numberOfLocks);
		}
	}

}
