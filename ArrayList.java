package ArrayList;

public class ArrayList {

	protected int length;
	protected int maxSize;
	protected DataElement[] list;

	public ArrayList() {
		length = 0;
		maxSize = 100;
		list = new DataElement[maxSize];
	}

	public ArrayList(int size) {
		if (size <= 0) {
			System.err.println("The array size must be positive." + "Creating an array of size 100. ");
			maxSize = 100;
		} else
			maxSize = size;
		length = 0;
		list = new DataElement[maxSize];
	}

	public ArrayList(ArrayList otherList) {
		maxSize = otherList.length;
		length = otherList.maxSize;
		list = new DataElement[maxSize];
	}

	public void copyList(ArrayList otherList) {
		maxSize = otherList.maxSize;
		length = otherList.length;
		list = new DataElement[maxSize];
		for (int j = 0; j < length; j++)
			list[j] = otherList.list[j].getCopy();

	}

	public int listSize() {
		return length;
	}

	public int maxListSize() {
		return maxSize;
	}

	public boolean isEmpty() {
		return (length == 0);
	}

	public boolean isFull() {
		return (length == maxSize);
	}

	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.println(list[i] + " ");
			System.out.println();
		}
	}

	public void clearList() {
		for (int i = 0; i < length; i++) {
			list[i] = null;

			length = 0;

			System.gc();
		}
	}

	public boolean isItemEqual(int location, DataElement item) {
		return (list[location].equals(item));
	}

	public void removeAt(int location) {
		if (location < 0 || location >= length)
			System.err.println("The location of the item to" + "be removed is out of range");

		else {
			for (int i = location; i < length - 1; i++) {
				list[i] = list[i + 1];

				list[length - 1] = null;

				length--;
			}
		}
	}// end removeAt

	public DataElement retrieveAt(int location) {
		if (location < 0 || location >= length) {
			System.err.println("The location of the item to " + "retrieved is out of range.");
			return null;
		} else
			return list[location].getCopy();
	}

	// end retrieveAt
	public void replaceAt(int location, DataElement repItem) {
		if (location < 0 || location >= length)
			System.err.println("The location of the item to" + "be replaced is out of range.");
		else
			list[location].makeCopy(repItem);

	}

	public void insertAt(int location, DataElement insertItem) {
		if (location < 0 || location >= maxSize)
			System.err.println("The position of the item to " + "be inserted is out of range");
		else if (length >= maxSize)
			System.err.println("Cannot insert in a full list");
		else {
			for (int i = length; i > location; i--)
				list[i] = list[i - 1];

			list[location] = insertItem.getCopy();
			length++;
		}
	}
	public void insertEnd(DataElement insertItem) {
		if(length >= maxSize)
			System.err.println("Canno insert in a full list.");
		else {
			list[length] = insertItem.getCopy();
			
			length++;
		}
	}
}
