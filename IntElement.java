package ArrayList;

public class IntElement extends DataElement {
	protected int num;
	
	public IntElement() {
		num = 0;
	}
	public IntElement (int n) {
		num = n;
	}
	public IntElement(IntElement otherElement) {
		num = otherElement.num;
	}
	public void setnum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
	@Override
	public boolean equals(DataElement otherElement) {
		IntElement temp = (IntElement) otherElement;
	return (num == temp.num);
	}
	public int compareTo(DataElement otherElement) {
		IntElement temp = (IntElement) otherElement;
		return (num - temp.num);
	}
	@Override
	public DataElement getCopy() {
		IntElement temp = new IntElement(num);
		return temp;
	}
	public void makeCopy(DataElement otherElement) {
		IntElement temp = new IntElement (num);
		num = temp.num;
	}
	public String toString() {
		return String.valueOf(num);
	}
	
}
