package stack;

public class StackSL {
	private StackNodeSL top;
	public StackSL() {
		this.top = null;
	}
	public StackSL(char item) {
		this.push(item);
	}
	public StackNodeSL getTop() {
		return this.top;
	}
	public void setTop(StackNodeSL top) {
		this.top = top;
	}
	public boolean isEmpty() {
		if (top == null) return true;
		else return false;
	}
	public int push(char item) {
		StackNodeSL node = new StackNodeSL(item);
         if(isEmpty()){
                top = node;
         }else{
                node.next= top;
                top= node;
         }
		return item;
	}
	public char pop() {
		  if(isEmpty()){
              System.out.println("stack is empty");
              return 0;
       }else{
    	   StackNodeSL node = top;
              top = node.next;
              return node.getData();
       }
	}
	public String toString() {
		StackNodeSL here = this.top;
		String buff = "Linked Stack >";
		while (here != null) {
			buff += "> " + here + " ";
			here = here.getNext();
		}
		return buff;
	}
}