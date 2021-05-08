package doorProject;

public class DoorManager {
	
	public void add(Door door) {
		Main.doors.add(door);
		System.out.println(door.id + " numaralý yeni bir kapý üretildi.");
	}
	
	public void delete(Door door) {
		Main.doors.remove(door);
		System.out.println(door.id + " numaralý kapý yýkýldý.");
	}
	
	public void update(Door door) {
		System.out.println(door.id + " numaralý kapý yenilendi.");
	}
	
	public void openDoor(Door door) {
		door.isOpen = true;
		System.out.println(door.id + " numaralý kapý açýldý.");
	}
	
	public void closeDoor(Door door) {
		door.isOpen = false;
		System.out.println(door.id + " numaralý kapý kapatýldý.");
	}
	
}
