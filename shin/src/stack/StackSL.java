package stack;

public class StackSL {

	/**
	 * stack�� ���� ���߿� �Է�(Last In)�� ����
	 * 
	 * @see #getTop()
	 * @see #setTop(StackNodeSL top)
	 */
	private StackNodeSL top;

	/**
	 * ������ ���� �� ������ ����
	 */
	public StackSL() {
		this.top = null;
	}

	/**
	 * ������ 1���� ������ ������ ����
	 * 
	 * @param item �����Ϸ��� �ʱ� ���� 1��
	 */
	public StackSL(char item) {
		this.push(item);
	}

	/**
	 * ������ top �����͸� �˻�
	 * 
	 * @return top�� ����� ������
	 */
	public StackNodeSL getTop() {
		return this.top;
	}

	/**
	 * ���ÿ��� ���� ���� �ִ� top �����͸� ����
	 * 
	 * @param top �����Ϸ��� ���� 1��
	 */
	public void setTop(StackNodeSL top) {
		this.top = top;
	}

	/**
	 * ���ÿ� �����Ͱ� ��� �ִ��� �˻�
	 * 
	 * @return true: �����, false: ���� ����
	 */
	public boolean isEmpty() {
		if (top == null) return true;
		else return false;
	}

	/**
	 * ���ÿ� �ű� �����͸� ����
	 * 
	 * @param item �����Ϸ��� ���� 1��
	 */
	public void push(char item) {
		StackNodeSL node = new StackNodeSL(item);
         if(isEmpty()){
                top = node;
         }else{
                node.next= top;
                top= node;
         }
	}

	/**
	 * ���ÿ��� ���� 1���� ����
	 * 
	 * @return ���ÿ��� ���� ������ 1��
	 */
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

	/**
	 * ��ü�� ���ڿ��� ��ȯ
	 * 
	 * @return ���׽� ǥ�� ���ڿ�
	 */
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