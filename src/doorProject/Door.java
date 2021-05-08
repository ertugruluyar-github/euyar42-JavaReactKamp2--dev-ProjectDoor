package doorProject;

public class Door {
	int id;
	String typeOfDoor;
	boolean isOpen;
	int numberOfLocks;
	
	public Door(int id, String typeOfDoor, boolean isOpen, int numberOfLocks) {
		this.id = id;
		this.typeOfDoor = typeOfDoor;
		this.isOpen = isOpen;
		this.numberOfLocks = numberOfLocks;
	}
	
	// Getter - Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfDoor() {
		return typeOfDoor;
	}

	public void setTypeOfDoor(String typeOfDoor) {
		this.typeOfDoor = typeOfDoor;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getNumberOfLocks() {
		return numberOfLocks;
	}

	public void setNumberOfLocks(int numberOfLocks) {
		this.numberOfLocks = numberOfLocks;
	}
	
	
}
