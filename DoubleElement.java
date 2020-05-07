package ArrayList;

public class DoubleElement extends DataElement {
protected double dub;

public DoubleElement() {
	dub = 0.0;
}
public DoubleElement(Double d) {
	dub = d;
}
public DoubleElement(DoubleElement otherElement) {
dub = otherElement.dub;
}
@Override
public boolean equals(DataElement otherElement) {
	DoubleElement temp = (DoubleElement) otherElement;
	return (dub == temp.dub);
}
@Override
public int compareTo(DataElement otherElement) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void makeCopy(DataElement otherElement) {
	DoubleElement temp = new DoubleElement(dub);
	dub = temp.dub;
}
@Override
public DataElement getCopy() {
	DoubleElement temp = new DoubleElement(dub);
	return temp;
}

}
