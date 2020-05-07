package ArrayList;

public class StringElement extends DataElement {
protected String str;

	public StringElement() {
		str = "";
	}
	public StringElement(String s) {
		str = s;
	}

	public StringElement(StringElement otherString) {
		str = otherString.str;
	}
	public boolean equals(DataElement otherElement) {
		StringElement temp = (StringElement) otherElement;
		return (str == temp.str);
	}
	public int compareTo(DataElement otherElement) {
		StringElement temp = (StringElement) otherElement;
		return (str.compareTo(temp.str));
	}
	public void makeCopy(DataElement otherElement) {
	StringElement temp = new StringElement(str);
		str = new String(temp.str);
	}
	public DataElement getCopy() {
		StringElement temp = new StringElement(str);
		return temp;
	}
	public String toString() {
		return str;
	}
	
}
