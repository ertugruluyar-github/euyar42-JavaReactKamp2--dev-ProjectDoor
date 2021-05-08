package doorProject;

public class DoorManager {
	
	public void add(Door door) {
		Main.doors.add(door);
		System.out.println(door.id + " numaral� yeni bir kap� �retildi.");
	}
	
	public void delete(Door door) {
		Main.doors.remove(door);
		System.out.println(door.id + " numaral� kap� y�k�ld�.");
	}
	
	public void update(Door door) {
		System.out.println(door.id + " numaral� kap� yenilendi.");
	}
	
	public void openDoor(Door door) {
		door.isOpen = true;
		System.out.println(door.id + " numaral� kap� a��ld�.");
	}
	
	public void closeDoor(Door door) {
		door.isOpen = false;
		System.out.println(door.id + " numaral� kap� kapat�ld�.");
	}
	
}
