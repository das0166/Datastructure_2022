package stack;

public class StackNodeSL {
	private char data;
	public StackNodeSL next = null;
	public StackNodeSL(char item) {
		 this.data = item;
         this.next =null;
	}
	public char getData() {
		return data;
	}
	public void setData(char aData) {
		this.data = aData;
	}
	public StackNodeSL getNext() {
		return this.next;
	}
	public void setNext(StackNodeSL aNext) {
		this.next = aNext;
	}
	public String toString() {	
		String buff = "";		
		buff += data + 0;		
		return buff;
	}
}
