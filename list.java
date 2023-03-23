package app;

public class list {

	private No head;
	
	public void add(Double value) {
	
			No no = new No();
			no.setValue(value);
			no.setNext(head);
			head =no;
	}

@Override
public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append("[");

	No p = head;
	while (p != null) {
		sb.append(p.getValue()+" ");
		p = p.getNext();
	}
	sb.append("]");
	return sb.toString();
}

}
